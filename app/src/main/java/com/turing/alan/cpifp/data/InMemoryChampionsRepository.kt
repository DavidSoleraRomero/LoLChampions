package com.turing.alan.cpifp.data

class InMemoryChampionsRepository private constructor(): ChampionsRepository {



    // Función que devuelve la lista de campeones
    override fun getChampions(): List<Champion> {
        return listOf(
            Champion(
                1,
                "K'Sante",
                "The Pride of Nazumah",
                "K'Sante is a warrior who has mastered the art of defense and fights for his homeland.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/KSante_0.jpg"
            ),
            Champion(
                2,
                "Ahri",
                "The Nine-Tailed Fox",
                "Innately connected to the latent power of Runeterra, Ahri is a vastaya who can reshape magic into orbs of raw energy.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg"
            ),
            Champion(
                3,
                "Ashe",
                "The Frost Archer",
                "Ashe is a skilled marksman who uses her bow to deal damage from a distance.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ashe_0.jpg"
            ),
            Champion(
                4,
                "Darius",
                "The Hand of Noxus",
                "Darius is a powerful warrior known for his immense strength and ability to dominate on the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Darius_0.jpg"
            ),
            Champion(
                5,
                "Draven",
                "The Glorious Executioner",
                "Draven is a flamboyant and powerful marksman who thrives on the thrill of the fight.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Draven_0.jpg"
            ),
            Champion(
                6,
                "Ezreal",
                "The Prodigal Explorer",
                "Ezreal is a charismatic adventurer who uses his magical gauntlet to unleash powerful spells.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ezreal_0.jpg"
            ),
            Champion(
                7,
                "Jinx",
                "The Loose Cannon",
                "A manic and impulsive criminal from Zaun, Jinx lives to wreak havoc without care for the consequences..",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg"
            ),
            Champion(
                8,
                "Kai'Sa",
                "Daughter of the Void",
                "Kai'Sa is a skilled hunter who wields the power of the Void to dominate her enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kaisa_0.jpg"
            ),
            Champion(
                9,
                "Katarina",
                "The Sinister Blade",
                "Katarina is a lethal assassin who excels in dealing burst damage and escaping quickly.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Katarina_0.jpg"
            ),
            Champion(
                10,
                "Lee Sin",
                "The Blind Monk",
                "Lee Sin is a master of martial arts who harnesses the power of sound to overcome his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/LeeSin_0.jpg"
            ),
            Champion(
                11,
                "Lux",
                "The Lady of Luminosity",
                "Luxanna Crownguard hails from Demacia, an insular realm where magical abilities are viewed with fear and suspicion.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lux_0.jpg"
            ),
            Champion(
                12,
                "Malphite",
                "The Monolith",
                "Malphite is a rock-solid champion who can withstand immense damage and deal area control.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Malphite_0.jpg"
            ),
            Champion(
                13,
                "Miss Fortune",
                "The Bounty Hunter",
                "Miss Fortune is a cunning gunner who excels at dealing damage from a distance.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MissFortune_0.jpg"
            ),
            Champion(
                14,
                "Riven",
                "The Exile",
                "Riven is a powerful and agile fighter known for her mobility and burst damage.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Riven_0.jpg"
            ),
            Champion(
                15,
                "Senna",
                "The Redeemer",
                "Senna is a powerful marksman who wields the power of light to heal allies and deal damage.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Senna_0.jpg"
            ),
            Champion(
                16,
                "Sett",
                "The Boss",
                "Sett is a brawler who uses his brute strength to dominate his opponents in combat.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Sett_0.jpg"
            ),
            Champion(
                17,
                "Shyvana",
                "The Half-Dragon",
                "Shyvana is a fierce warrior who can transform into a dragon and unleash her power.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Shyvana_0.jpg"
            ),
            Champion(
                18,
                "Sona",
                "Maven of the Strings",
                "Sona is a musical champion who uses her melodies to heal allies and damage enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Sona_0.jpg"
            ),
            Champion(
                19,
                "Soraka",
                "The Starchild",
                "Soraka is a healer who uses her celestial powers to protect and restore her allies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Soraka_0.jpg"
            ),
            Champion(
                20,
                "Thresh",
                "The Chain Warden",
                "Thresh is a sinister warden who traps his enemies in chains and controls the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Thresh_0.jpg"
            ),
            Champion(
                21,
                "Vayne",
                "The Night Hunter",
                "Vayne is a relentless hunter who excels at taking down high-priority targets.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vayne_6.jpg"
            ),
            Champion(
                22,
                "Zed",
                "The Master of Shadows",
                "Zed is a deadly assassin who manipulates shadows to outmaneuver his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zed_0.jpg"
            ),
            Champion(
                23,
                "Yasuo",
                "The Unforgiven",
                "An agile swordsman, Yasuo fights with the power of the wind at his beck and call, turning aside missiles and cutting down foes in the blink of an eye.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yasuo_0.jpg"
            ),
            Champion(
                24,
                "Jhin",
                "The Virtuoso",
                "Jhin is a meticulous assassin who uses his artistic flair to execute his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jhin_0.jpg"
            ),
            Champion(
                25,
                "Garen",
                "The Might of Demacia",
                "A proud and noble warrior, Garen fights at the head of the Dauntless Vanguard, defending Demacia with all his might and courage.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Garen_0.jpg"
            ),
            Champion(
                26,
                "Rammus",
                "The Armordillo",
                "Rammus is a tanky champion who rolls into enemies, dealing damage and stunning them.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Rammus_0.jpg"
            ),
            Champion(
                27,
                "Viktor",
                "The Machine Herald",
                "Viktor is a brilliant inventor who uses technology to dominate the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Viktor_0.jpg"
            ),
            Champion(
                28,
                "Nautilus",
                "The Titan of the Depths",
                "Nautilus is a massive tank who controls the battlefield with his hook and crowd control.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nautilus_0.jpg"
            ),
            Champion(
                29,
                "Teemo",
                "The Swift Scout",
                "Undeterred by even the most dangerous and threatening of missions, Teemo scouts the world with boundless enthusiasm and a smile on his face.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Teemo_0.jpg"
            ),
            Champion(
                30,
                "Taliyah",
                "The Stoneweaver",
                "Taliyah is a skilled stone mage who controls the earth to assist her allies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Taliyah_0.jpg"
            ),
            Champion(
                31,
                "Akali",
                "The Rogue Assassin",
                "Akali is a fierce assassin who can blend into shadows and strike her foes with deadly precision.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Akali_0.jpg"
            ),
            Champion(
                32,
                "Anivia",
                "The Cryophoenix",
                "Anivia is a powerful mage who can manipulate ice to control the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Anivia_0.jpg"
            ),
            Champion(
                33,
                "Aatrox",
                "The Darkin Blade",
                "Aatrox is a dark warrior who uses his sword to deal devastating damage to his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg"
            ),
            Champion(
                34,
                "Fiora",
                "The Grand Duelist",
                "Fiora is a master duelist who excels at taking down one opponent at a time.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Fiora_0.jpg"
            ),
            Champion(
                35,
                "Gnar",
                "The Missing Link",
                "Gnar is a yordle who transforms between forms to deal damage and control the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Gnar_0.jpg"
            ),
            Champion(
                36,
                "Janna",
                "The Storm's Fury",
                "Janna is a supportive champion who uses her wind magic to protect her allies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Janna_0.jpg"
            ),
            Champion(
                37,
                "Lulu",
                "The Fae Sorceress",
                "Lulu is a whimsical support champion who uses her magic to protect and empower her teammates.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lulu_0.jpg"
            ),
            Champion(
                38,
                "Riven",
                "The Exile",
                "Riven is a skilled warrior who uses her broken sword to unleash powerful combos.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Riven_0.jpg"
            ),
            Champion(
                39,
                "Talon",
                "The Blade's Shadow",
                "Talon is a deadly assassin who moves quickly between enemies, striking them down.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Talon_0.jpg"
            ),
            Champion(
                40,
                "Zyra",
                "The Rise of the Thorns",
                "Zyra is a powerful mage who uses plants to control the battlefield and deal damage.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zyra_0.jpg"
            )
        )

    }

    override fun readOne(championId: Int): Champion = getChampions().single { it.id == championId }

    companion object {
        // Instancia única del repositorio
        @Volatile
        private var instance: ChampionsRepository? = null

        // Método para obtener la instancia de manera segura
        fun getInstance(): ChampionsRepository {
            return instance ?: synchronized(this) {
                instance ?: InMemoryChampionsRepository().also { instance = it }
            }
        }
    }
}