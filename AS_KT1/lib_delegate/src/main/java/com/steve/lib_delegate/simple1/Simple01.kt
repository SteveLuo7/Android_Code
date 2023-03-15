package com.steve.lib_delegate.simple1

//委托 == 代理

//    后期学习compose是重委托框架

interface DB {
    fun save()
}


class sqlDB( ) : DB {
    override fun save() = println("save to sql")

}class MysqlDB( ) : DB {
    override fun save() = println("save to Mysql")

}class OracleDB( ) : DB {
    override fun save() = println("save to Oracle")
}

class CreateDBAction(db: DB) : DB by db

fun main() {

    CreateDBAction(sqlDB()).save()
    CreateDBAction(MysqlDB()).save()
    CreateDBAction(OracleDB()).save()
}
