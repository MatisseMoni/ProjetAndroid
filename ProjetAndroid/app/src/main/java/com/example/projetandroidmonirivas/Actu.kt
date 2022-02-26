package com.example.projetandroidmonirivas


    class Actu(
        private var nomActu: String,
        private var nomImage: String,
        private var descriptionActu: String
    )
    {
        fun getdescriptionActu(): String {
            return descriptionActu
        }

        fun setPopulation(descriptionActu: String) {
            this.descriptionActu = descriptionActu
        }

        fun getnomActu(): String {
            return nomActu
        }

        fun setCountryName(nomActu: String) {
            this.nomActu = nomActu
        }

        fun getnomImage(): String {
            return nomImage
        }

        fun setFlagName(nomImage: String) {
            this.nomImage = nomImage
        }

        override fun toString(): String {
            return nomActu + " (Description: " + descriptionActu + ")"
        }
    }
