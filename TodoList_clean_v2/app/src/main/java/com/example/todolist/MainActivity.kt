package com.example.todolist

import android.os.Bundle
//import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val todos = mutableListOf("")
    private lateinit var adapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = TodoAdapter(todos)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.addButton.setOnClickListener {
            showAddTodoDialog()
        }
    }

    private fun showAddTodoDialog() {
        val input = EditText(this)
        AlertDialog.Builder(this)
            .setTitle("Add to-do item")
            .setView(input)
            .setPositiveButton("add") { _, _ ->
                val todo = input.text.toString().trim()
                if (todo.isNotEmpty()) {
                    todos.add(todo)
                    adapter.notifyItemInserted(todos.size - 1)
                } else {
                    Toast.makeText(this, "Please enter the task", Toast.LENGTH_SHORT).show()
                }
            }
            .setNegativeButton("cancel", null)
            .show()
    }
}