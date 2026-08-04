package com.example.feriavocacional.activities

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.adapters.ProductoAdapter
import com.example.feriavocacional.models.Producto

class productos : AppCompatActivity() {

    private lateinit var recyclerProductos: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_productos)

        recyclerProductos =
            findViewById(R.id.recyclerProductos)

        recyclerProductos.layoutManager =
            LinearLayoutManager(this)

        val listaProductos = listOf(

            Producto(
                1,
                "Baby Yoda",
                "Peluche inspirado en Grogu.",
                "Peluches",
                250.0,
                12,
                R.drawable.baby,
                true
            ),

            Producto(
                2,
                "Pusheen",
                "Peluche oficial de Pusheen.",
                "Peluches",
                180.0,
                20,
                R.drawable.pushen,
                true
            ),

            Producto(
                3,
                "Rilakkuma",
                "Peluche súper suave.",
                "Peluches",
                220.0,
                15,
                R.drawable.rilakkuma,
                true
            ),

            Producto(
                4,
                "Kiiroitori",
                "El mejor amigo de Rilakkuma.",
                "Peluches",
                90.0,
                18,
                R.drawable.kiiroitori,
                true
            ),

            Producto(
                5,
                "Copito",
                "Peluche blanco muy suave.",
                "Peluches",
                55.0,
                25,
                R.drawable.copito,
                true
            ),
            Producto(
            6,
            "Dino",
            "Peluche de dinosaurio suave y adorable.",
            "Peluches",
            150.0,
            15,
            R.drawable.dino,
            true
        ),

        Producto(
            7,
            "Oveja",
            "Peluche de ovejita suave y adorable.",
            "Peluches",
            125.0,
            12,
            R.drawable.obeja,
            true
        ),

        Producto(
            8,
            "Cerdito",
            "Peluche de cerdito ideal para regalar.",
            "Peluches",
            100.0,
            20,
            R.drawable.cerdito,
            true
        ),

        Producto(
            9,
            "Rainbow Dash",
            "Figura inspirada en Rainbow Dash de My Little Pony.",
            "Figuras",
            180.0,
            10,
            R.drawable.rainbowdash,
            true
        ),

        Producto(
            10,
            "My Little Pony",
            "Figura coleccionable de My Little Pony.",
            "Figuras",
            180.0,
            10,
            R.drawable.mylittlepony,
            true
        ),

        Producto(
            11,
            "Ratón",
            "Peluche de ratoncito suave y tierno.",
            "Peluches",
            95.0,
            15,
            R.drawable.raton,
            true
        ),

        Producto(
            12,
            "Miffy Blind Box",
            "Caja sorpresa coleccionable de Miffy.",
            "Coleccionables",
            120.0,
            20,
            R.drawable.miffyblindbox,
            true
        ),

        Producto(
            13,
            "Kurousa",
            "Peluche coleccionable de Kurousa.",
            "Peluches",
            160.0,
            10,
            R.drawable.kurousa,
            true
        ),

        Producto(
            14,
            "Hachiware Sanrio",
            "Peluche coleccionable de Hachiware.",
            "Sanrio",
            180.0,
            12,
            R.drawable.hachiwaresanrio,
            true
        ),

        Producto(
            15,
            "Hamtaro",
            "Peluche adorable inspirado en Hamtaro.",
            "Peluches",
            150.0,
            15,
            R.drawable.hamtaro,
            true
        ),

        Producto(
            16,
            "Mamegoma",
            "Peluche de Mamegoma suave y adorable.",
            "Peluches",
            140.0,
            15,
            R.drawable.mamegoma,
            true
        ),

        Producto(
            17,
            "Mamegoma Peluche",
            "Peluche coleccionable de Mamegoma.",
            "Peluches",
            175.0,
            10,
            R.drawable.mamegomapeluche,
            true
        ),

        Producto(
            18,
            "Pecera Mamegoma",
            "Set coleccionable con temática de Mamegoma.",
            "Coleccionables",
            200.0,
            8,
            R.drawable.peceramamegoma,
            true
        ),

        Producto(
            19,
            "Pudding",
            "Peluche tierno y suave de Pudding.",
            "Peluches",
            130.0,
            12,
            R.drawable.pudding,
            true
        ),

        Producto(
            20,
            "Gatito",
            "Peluche de gatito suave y adorable.",
            "Peluches",
            110.0,
            20,
            R.drawable.gatito,
            true
        ),

        Producto(
            21,
            "Perrito",
            "Peluche de perrito suave y adorable.",
            "Peluches",
            110.0,
            20,
            R.drawable.perrito,
            true
        ),

        Producto(
            22,
            "Molang",
            "Peluche adorable inspirado en Molang.",
            "Peluches",
            145.0,
            12,
            R.drawable.molang,
            true
        ),

        Producto(
            23,
            "Pusheen Galleta",
            "Peluche de Pusheen con diseño de galleta.",
            "Pusheen",
            180.0,
            10,
            R.drawable.pusheengalleta,
            true
        ),

        Producto(
            24,
            "Pusheen",
            "Peluche clásico de Pusheen.",
            "Pusheen",
            320.0,
            20,
            R.drawable.pusheen,
            true
        ),

        Producto(
            25,
            "Buzz Lightyear",
            "Figura coleccionable inspirada en Buzz Lightyear.",
            "Figuras",
            250.0,
            10,
            R.drawable.buzzlightyear,
            true
        ),

        Producto(
            26,
            "Spider-Man",
            "Figura de acción inspirada en Spider-Man.",
            "Figuras",
            250.0,
            10,
            R.drawable.spiderman,
            true
        ),

        Producto(
            27,
            "Maleta de Juguetes",
            "Maleta con juguetes para llevar tus aventuras a cualquier lugar.",
            "Juguetes",
            300.0,
            8,
            R.drawable.maletadejuguetes,
            true
        ),

        Producto(
            28,
            "Play-Doh",
            "Set de plastilina Play-Doh para crear y jugar.",
            "Juguetes",
            100.0,
            20,
            R.drawable.playdoh,
            true
        ),

        Producto(
            29,
            "Snoopy Funko Llavero",
            "Llavero coleccionable de Snoopy.",
            "Coleccionables",
            150.0,
            10,
            R.drawable.snoopyfunkollavero,
            true
        ),

        Producto(
            30,
            "Bob Funko Llavero",
            "Llavero coleccionable de Bob.",
            "Coleccionables",
            150.0,
            10,
            R.drawable.bobfunkollavero,
            true
        ),

        Producto(
            31,
            "Pikachu",
            "Figura coleccionable de Pikachu.",
            "Figuras",
            220.0,
            12,
            R.drawable.pikachu,
            true
        ),

        Producto(
            32,
            "My Melody",
            "Peluche adorable de My Melody.",
            "Sanrio",
            180.0,
            15,
            R.drawable.mymelody,
            true
        ),

        Producto(
            33,
            "Sanrio Kit",
            "Kit especial con productos coleccionables de Sanrio.",
            "Sanrio",
            250.0,
            8,
            R.drawable.sanriokit,
            true
        ),

        Producto(
            34,
            "Miffy",
            "Peluche clásico de Miffy.",
            "Peluches",
            180.0,
            15,
            R.drawable.miffy,
            true
        ),

        Producto(
            35,
            "Chikawa Blind Box",
            "Caja sorpresa coleccionable de Chikawa.",
            "Coleccionables",
            120.0,
            20,
            R.drawable.chikawablindbox,
            true
        ),

        Producto(
            36,
            "Sylvanian Families",
            "Figura coleccionable de Sylvanian Families.",
            "Figuras",
            350.0,
            8,
            R.drawable.sylvanianfamilies,
            true
        ),

        Producto(
            37,
            "Figura Rilakkuma",
            "Figura coleccionable de Rilakkuma.",
            "Figuras",
            200.0,
            10,
            R.drawable.figurarirakkuma,
            true
        ),

        Producto(
            38,
            "Littlest Pet Shop",
            "Figura coleccionable de Littlest Pet Shop.",
            "Figuras",
            180.0,
            12,
            R.drawable.littlestpetshop,
            true
        ),

        Producto(
            39,
            "Jorge el Curioso",
            "Peluche adorable de Jorge el Curioso.",
            "Peluches",
            160.0,
            12,
            R.drawable.jorgeelcurioso,
            true
        ),

        Producto(
            40,
            "Korilakkuma",
            "Peluche adorable de Korilakkuma.",
            "Peluches",
            220.0,
            10,
            R.drawable.korilakkuma,
            true
            )
        )

        val adapter =
            ProductoAdapter(listaProductos)

        recyclerProductos.adapter =
            adapter

        val btnVerMiCarrito =
            findViewById<Button>(R.id.btnVerMiCarrito)

        btnVerMiCarrito.setOnClickListener {

            val intent =
                Intent(
                    this,
                    MiCarritoActivity::class.java
                )

            startActivity(intent)
        }
        val btnCerrarSesion =
            findViewById<Button>(R.id.btnCerrarSesion)

        btnCerrarSesion.setOnClickListener {

            val intent = Intent(
                this,
                iniciarsesion::class.java
            )

            startActivity(intent)

            finish()
        }
        val etBuscarProducto = findViewById<EditText>(R.id.etBuscarProducto)

        etBuscarProducto.addTextChangedListener(

            object : TextWatcher {

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {}

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {

                    val texto = s.toString()

                    val productosFiltrados =
                        listaProductos.filter {

                            it.nombre.contains(
                                texto,
                                ignoreCase = true
                            )
                        }

                    recyclerProductos.adapter =
                        ProductoAdapter(
                            productosFiltrados
                        )
                }

                override fun afterTextChanged(
                    s: Editable?
                ) {}
            }
        )

    }
}