package com.sist.lastapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class PopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop)
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
                var intent=Intent(this,PopActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recommend->{
                var intent=Intent(this,RecommendActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_recipe->{
                var intent=Intent(this,RecipeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.home_news->{
                var intent=Intent(this,NewsActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}