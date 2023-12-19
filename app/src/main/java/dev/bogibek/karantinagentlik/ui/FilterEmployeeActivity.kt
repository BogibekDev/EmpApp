package dev.bogibek.karantinagentlik.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bogibek.karantinagentlik.adapter.EmployeeLinkAdapter
import dev.bogibek.karantinagentlik.databinding.ActivityFilterEmployeeBinding
import dev.bogibek.karantinagentlik.model.Link

class FilterEmployeeActivity : AppCompatActivity() {
    private val binding by lazy { ActivityFilterEmployeeBinding.inflate(layoutInflater) }
    private lateinit var adapter: EmployeeLinkAdapter
    private val list = ArrayList<Link>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            getLinks()
            adapter = EmployeeLinkAdapter(list)
            binding.apply {
                rvLinks.adapter = adapter
                adapter.itemClick = { link ->
                    Intent(this@FilterEmployeeActivity, EmployeeListActivity::class.java).also {
                        it.putExtra("link", link.link)
                        startActivity(it)
                    }
                }
            }
        }
    }

    private fun getLinks() {
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))
        list.add(Link(title = "boshqarma", link = "https://xorazm-karantin.uz/boshqarma/boshqarma-bolimlari/48-boshqarma-mutaxassislari.html"))


    }
}