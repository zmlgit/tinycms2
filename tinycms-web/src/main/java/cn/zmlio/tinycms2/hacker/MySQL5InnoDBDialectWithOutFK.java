package cn.zmlio.tinycms2.hacker;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * 阻止生成外键
 * Created by zml on 2017/1/1.
 */
public class MySQL5InnoDBDialectWithOutFK extends MySQL5InnoDBDialect {

    @Override
    public String getAddForeignKeyConstraintString(String constraintName, String[] foreignKey, String referencedTable, String[] primaryKey, boolean referencesPrimaryKey) {
        return ";";
    }
}
