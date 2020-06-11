package com.sist.lastapplication

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_recipe.*
import org.json.JSONObject
import java.net.URL

class RecipeActivity : AppCompatActivity() {
    var dataList = ArrayList<HashMap<String, String>>()
    var page:Int=1
    var totalPage:Int=1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        fetchJsonData().execute("1")

        prevBtn.setOnClickListener{
            if(page>1)
            {
                page--
                dataList.clear()
                fetchJsonData().execute(page.toString())
            }
        }
        nextBtn.setOnClickListener{
            if(page<totalPage)
            {
                page++
                dataList.clear()
                fetchJsonData().execute(page.toString())
            }
        }
    }
    inner class fetchJsonData() : AsyncTask<String, Void, String>() {
        override fun onPreExecute() {
            super.onPreExecute()

        }

        override fun doInBackground(vararg params: String?): String? {
            return URL("http://211.238.142.200:3355/recipe2?page="+params[0]).readText(
                Charsets.UTF_8
            )
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val jsonObj = JSONObject(result)
            val usersArr = jsonObj.getJSONArray("recipe")
            for (i in 0 until usersArr.length()) {
                val singleUser = usersArr.getJSONObject(i)

                val map = HashMap<String, String>()
                map["title"] = singleUser.getString("title")
                map["poster"] = singleUser.getString("poster")
                dataList.add(map)
            }
            val recipteListView=findViewById<ListView>(R.id.recipe_listView)
            recipteListView.adapter = RecipeAdapter(this@RecipeActivity, dataList)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId)
        {
            R.id.home_menu->{
                var intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_pop->{
                var intent= Intent(this,PopActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recommend->{
                var intent= Intent(this,RecommendActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recipe->{
                var intent= Intent(this,RecipeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_news->{
                var intent= Intent(this,NewsActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}