package com.example.demo.lvl.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLevel is a Querydsl query type for Level
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLevel extends EntityPathBase<Level> {

    private static final long serialVersionUID = -1019383936L;

    public static final QLevel level1 = new QLevel("level1");

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final ListPath<com.example.demo.usr.domain.User, com.example.demo.usr.domain.QUser> userList = this.<com.example.demo.usr.domain.User, com.example.demo.usr.domain.QUser>createList("userList", com.example.demo.usr.domain.User.class, com.example.demo.usr.domain.QUser.class, PathInits.DIRECT2);

    public QLevel(String variable) {
        super(Level.class, forVariable(variable));
    }

    public QLevel(Path<? extends Level> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLevel(PathMetadata metadata) {
        super(Level.class, metadata);
    }

}

