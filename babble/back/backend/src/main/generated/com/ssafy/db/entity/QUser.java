package com.babble.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 846542477L;

    public static final QUser user = new QUser("user");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<Conference, QConference> conference = this.<Conference, QConference>createList("conference", Conference.class, QConference.class, PathInits.DIRECT2);

    public final ListPath<ConferenceHistory, QConferenceHistory> conferenceHistory = this.<ConferenceHistory, QConferenceHistory>createList("conferenceHistory", ConferenceHistory.class, QConferenceHistory.class, PathInits.DIRECT2);

    public final StringPath department = createString("department");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath position = createString("position");

    public final ListPath<UserConference, QUserConference> userConference = this.<UserConference, QUserConference>createList("userConference", UserConference.class, QUserConference.class, PathInits.DIRECT2);

    public final StringPath userId = createString("userId");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

