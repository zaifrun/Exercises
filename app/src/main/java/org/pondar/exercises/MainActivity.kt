package org.pondar.exercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.pondar.exercises.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val list = ArrayList<Person>()
        val p1 = Person("martin", 43)
        val p2 = Worker("Karl", 15, 10000)
        val p3 = Pensionist("Gunhild", 73, 2015)

        Log.d("Karl teenager?",p2.isTeenager().toString())
        Log.d("Gulhild teenager?",p3.isTeenager().toString())


        list.add(p1)
        list.add(Person("Bent", 56))
        list.add(p2)
        list.add(p3)

        binding.myNameButton.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "Hello, Martin", Toast.LENGTH_LONG)
            toast.show()
        }


        binding.button.setOnClickListener {
            var text = ""
            for (person in list) {
                Log.d("Person", person.toString())
                text = text + person.toString() + "\n"
            }

            Log.d("allpersons", text)

            val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_LONG)
            toast.show()
        }


        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_checked, list
        )

        binding.mylist.choiceMode = ListView.CHOICE_MODE_SINGLE

        binding.mylist.adapter = adapter
        binding.mylist.setOnItemClickListener { parent, view, position, id ->
            Log.d("listview", "itemclicked")
            val person = list[position]
            Toast.makeText(applicationContext, "you clicked : $person", Toast.LENGTH_SHORT).show()
        }


    }
}