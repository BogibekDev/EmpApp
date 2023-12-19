package dev.bogibek.karantinagentlik.utils


fun getWebLinks(): Map<String, String> {
    val links = HashMap<String, String>()

    links["boshqarma"] = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"
    links["boliim"] = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"

    //add some links here


    return links
}


fun getTelegramLinks(): Map<String, String> {
    val links = HashMap<String, String>()

    links["boshqarma"] = "https://t.me/+kA8xjhZ_8m8wMWUy"
    links["bolim"] = "https://t.me/+kA8xjhZ_8m8wMWUy"

    //add some links here


    return links
}
