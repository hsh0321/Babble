package com.babble.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConferenceCategory is a Querydsl query type for ConferenceCategory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConferenceCategory extends EntityPathBase<ConferenceCategory> {

    private static final long serialVersionUID = -10561156L;

    public static final QConferenceCategory conferenceCategory = new QConferenceCategory("conferenceCategory");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<Conference, QConference> conference = this.<Conference, QConference>createList("conference", Conference.class, QConference.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QConferenceCategory(String variable) {
        super(ConferenceCategory.class, forVariable(variable));
    }

    public QConferenceCategory(Path<? extends ConferenceCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConferenceCategory(PathMetadata metadata) {
        super(ConferenceCategory.class, metadata);
    }

}

