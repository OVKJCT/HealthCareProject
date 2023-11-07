package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.update
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthcareproject.databinding.ActivityBodyCheckBinding
import com.google.android.gms.tasks.Task
import com.google.api.Distribution.BucketOptions.Linear
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import java.lang.reflect.Field

private var auth : FirebaseAuth = Firebase.auth

private var STORE = FirebaseFirestore.getInstance()

class BodyCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_check)

        val binding = ActivityBodyCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent10 = Intent(this, MainActivity::class.java)
        binding.HomeButton4.setOnClickListener {startActivity(intent10)}

        val itemList = ArrayList<TodoListData>()

        val todoListAdapter = TodoListAdapter(itemList)

        todoListAdapter.notifyDataSetChanged()

        binding.recyclerView.adapter = todoListAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.addbutton.setOnClickListener {
            var edittext = EditText(this)

            AlertDialog.Builder(this)
                .setTitle("해야 할 일을 적어주세요!")
                .setView(edittext)
                .setPositiveButton("완료") { _, _ ->
                    saveuserinformation(edittext.text.toString())

                    itemList.add(TodoListData(edittext.text.toString()))

                }

                .setNegativeButton("취소") { dialog, _ ->
                    dialog.dismiss()
                }
                .setCancelable(false)
                .show()
        }

        binding.tododeletebutton.setOnClickListener {

            val checkbox123 = findViewById<CheckBox>(R.id.checkBox123)

            checkbox123.setOnCheckedChangeListener { _, isChecked ->

                if(checkbox123.isChecked) {

                }

            }

        }

    }
    private fun saveuserinformation(TODO : String) {

        val userUID3 = auth.currentUser?.uid.orEmpty()

        data class USERS(
            val ID: String? = null,
            val MEMO: List<String>? = null,
            val Todolist: List<String>? = null,
        )

        val users = USERS (
            userUID3,
            null,
            arrayListOf(TODO),
        )


        STORE.collection("USERS").document("users").update("users", users)
    }

}