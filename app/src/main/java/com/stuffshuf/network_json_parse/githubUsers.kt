package com.stuffshuf.network_json_parse

import java.util.ArrayList

data class githubUsers(
    val items:ArrayList<Item>
)



data class Item(
    val login:String,
    val id:Int,
    val node_id:String
)