package com.driveywyze.jdbenito.databindingbasics

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.driveywyze.jdbenito.databindingbasics.databinding.ActivityMainBinding
import com.driveywyze.jdbenito.databindingbasics.model.Person

class MainActivity : AppCompatActivity(), MainActivityPresenter.View {

    var currentPerson: Person = Person()

    val presenter = MainActivityPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        currentPerson.firstName.set("John")
        currentPerson.lastName.set("Doe")

        val binding: ActivityMainBinding  = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.currentPerson = currentPerson
        binding.activity = this
    }

    override fun onStart() {
        super.onStart()
        presenter.register(this)
    }

    override fun onStop() {
        presenter.unregister()
        super.onStop()
    }

    fun onUpdateButtonClick(view: View) {
        onUpdate()
    }


    override fun onUpdate() {
        currentPerson.firstName.set("Foo")
        currentPerson.lastName.set("Bar")
    }
}