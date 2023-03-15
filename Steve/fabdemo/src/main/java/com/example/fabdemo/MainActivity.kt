package com.example.fabdemo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.fabdemo.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    var listItem = ArrayList<String>()
    var adapter: ArrayAdapter<String> ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            addListItem()
            Snackbar.make(view, "项目添加到列表", Snackbar.LENGTH_LONG)
                .setAction("撤销", UndoOnClickListener).show()
        }
    }

    var UndoOnClickListener: View.OnClickListener = View.OnClickListener {view ->
        listItem.removeAt(listItem.size - 1)
        adapter?.notifyDataSetChanged()
        Snackbar.make(view, "项目已经移除", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()

    }

    private fun addListItem() {
        val dateFormat: SimpleDateFormat = SimpleDateFormat("yyyy:/MM/dd HH:mm:ss")
        listItem.add(dateFormat.format(Date()))
        adapter?.notifyDataSetChanged()
    }

    override fun onStart() {
        super.onStart()
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listItem)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}