package com.babble.db.repository;


import com.babble.db.entity.*;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 시청 내역 관련 디비 쿼리 생성을 위한 구현 정의.
 */
@Repository
public class RoomHistoryRepositorySupport {

    @Autowired
    private JPAQueryFactory jpaQueryFactory;
    QRoomHistory qRoomHistory =QRoomHistory.roomHistory;
    QRoom qRoom = QRoom.room;
    QCategory qCategory = QCategory.category;

    public RoomHistory findRoomHistoryByUserEmail(User user, Room room){
        RoomHistory roomHistory = jpaQueryFactory.select(qRoomHistory)
                .from(qRoomHistory)
                .where(qRoomHistory.room.id.eq(room.getId()))
                .where(qRoomHistory.user.id.eq(user.getId())).fetchOne();
        if(roomHistory==null) return null;
        return roomHistory;
    }

    public List<Tuple> getUserViewHistory(User user){
        List<Tuple> userHistory = jpaQueryFactory.select(qRoom.title,qCategory.name, qRoom.createTime,
                qRoomHistory.startTime,qRoomHistory.endTime,qRoom.maxView)
                .from(qRoom).join(qCategory).on(qRoom.category.id.eq(qCategory.id))
                .join(qRoomHistory).on(qRoom.id.eq(qRoomHistory.room.id))
                .where(qRoomHistory.user.id.eq(user.getId()))
                .where(qRoom.isActivate.eq(false))
                .fetch();

        return userHistory;
    }

    public List<Tuple> getCreateRoomHistory(User user){

        List<Tuple> userHistory = jpaQueryFactory.select(qRoom.title,qCategory.name, qRoom.createTime,qRoom.maxView)
                .from(qRoom).leftJoin(qCategory).on(qRoom.category.id.eq(qCategory.id))
                .where(qRoom.hostId.eq(user.getId()))
                .where(qRoom.isActivate.eq(false))
                .fetch();

        return userHistory;
    }

    public List<RoomHistory> findRoomHistoryByRoomId(Long roomId){
        List<RoomHistory> roomHistories = jpaQueryFactory.select(qRoomHistory)
                .from(qRoomHistory)
                .where(qRoomHistory.room.id.eq(roomId))
                .where(qRoomHistory.endTime.isNull()).fetch();

        return roomHistories;
    }

    public void deleteUserHistory(User user){
        jpaQueryFactory.delete(qRoomHistory)
                .where(qRoomHistory.user.id.eq(user.getId())).execute();
    }


}
