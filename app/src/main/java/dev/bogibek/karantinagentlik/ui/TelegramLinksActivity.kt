package dev.bogibek.karantinagentlik.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bogibek.karantinagentlik.adapter.LinkAdapter
import dev.bogibek.karantinagentlik.databinding.ActivityTelegramLinksBinding
import dev.bogibek.karantinagentlik.model.Link

class TelegramLinksActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTelegramLinksBinding.inflate(layoutInflater) }
    private lateinit var adapter: LinkAdapter
    private val list = ArrayList<Link>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        getLinks()
        adapter = LinkAdapter(list)
        binding.apply {
            rvTGLinks.adapter = adapter
            adapter.itemClick = {

                try {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it.link))
                    intent.setPackage("org.telegram.messenger")
                    startActivity(intent)
                } catch (e: Exception) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it.link))
                    startActivity(intent)
                }

            }
        }

    }

    private fun getLinks() {
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))
        list.add(Link(title = "boshqarma", link = "https://t.me/+kA8xjhZ_8m8wMWUy"))

    }
}