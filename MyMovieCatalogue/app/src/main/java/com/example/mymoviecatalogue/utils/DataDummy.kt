package com.example.mymoviecatalogue.utils

import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.data.MovieEntity
import com.example.mymoviecatalogue.data.TVShowEntity

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(MovieEntity(R.drawable.poster_alita,
            "Alita: Battle Angel",
            "An angel falls. A warrior rises.",
            "Action, Science Fiction, Adventure",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            "January 31, 2019",
            "https://www.themoviedb.org/movie/399579-alita-battle-angel/watch"))
        movie.add(MovieEntity(R.drawable.poster_aquaman,
            "Aquaman",
            "Home Is Calling",
            "Action, Adventure, Fantasy",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "December 7, 2018",
            "https://www.themoviedb.org/movie/297802-aquaman/watch"))
        movie.add(MovieEntity(R.drawable.poster_ralph,
            "Wreck-It Ralph",
            "The story of a regular guy just looking for a little wreck-ognition.",
            "Family, Animation, Comedy, Adventure",
            "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
            "January 1, 2012",
            "https://www.themoviedb.org/movie/82690-wreck-it-ralph/watch"))
        movie.add(MovieEntity(R.drawable.poster_glass,
            "Glass",
            "You Cannot Contain What You Are",
            "Thriller, Drama, Science Fiction",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "January 16, 2019",
            "https://www.themoviedb.org/movie/450465-glass/watch"))
        movie.add(MovieEntity(R.drawable.poster_how_to_train,
            "How to Train Your Dragon",
            "The friendship of a lifetime",
            "Animation, Family, Adventure",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "January 3, 2019",
            "https://www.themoviedb.org/movie/166428-how-to-train-your-dragon-the-hidden-world/watch"))
        movie.add(MovieEntity(R.drawable.poster_infinity_war,
            "Avengers: Infinity War",
            "An entire universe. Once and for all.",
            "Adventure, Action, Science Fiction",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "April 25, 2018",
            "https://www.themoviedb.org/movie/299536-avengers-infinity-war/watch"))
        movie.add(MovieEntity(R.drawable.poster_mortal_engines,
            "Mortal Engines",
            "Some scars never heal",
            "Adventure, Science Fiction\n",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "November 27, 2018",
            "https://www.themoviedb.org/movie/428078-mortal-engines/watch"))
        movie.add(MovieEntity(R.drawable.poster_robin_hood,
            "Robin Hood",
            "The legend you know. The story you don't.",
            "Adventure, Action, Thriller",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "November 21, 2018",
            "https://www.themoviedb.org/movie/375588-robin-hood/watch"))
        movie.add(MovieEntity(R.drawable.poster_serenity,
            "Serenity",
            "On Plymouth Island, no one ever dies… unless you break the rules",
            "Thriller, Mystery, Drama",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "January 24, 2019",
            "https://www.themoviedb.org/movie/452832-serenity/watch"))
        movie.add(MovieEntity(R.drawable.poster_spiderman,
            "Spider-Man: Into the Spider-Verse",
            "More Than One Wears the Mask",
            "Action, Adventure, Animation, Science Fiction, Comedy",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "December 6, 2018",
            "https://www.themoviedb.org/movie/324857-spider-man-into-the-spider-verse/watch"))

        return movie
    }

    fun generateDummyTVShow(): List<TVShowEntity> {

        val tvshow = ArrayList<TVShowEntity>()

        tvshow.add(TVShowEntity(R.drawable.poster_fairytail,
            "Fairy Tail",
            "Fairy Tail",
            "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "October 12, 2009",
            "https://www.themoviedb.org/tv/46261/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_family_guy,
            "Family Guy",
            "Parental Discretion Advised, that's how you know it's good",
            "Animation, Comedy",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "January 31, 1999",
            "https://www.themoviedb.org/tv/1434-family-guy/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_flash,
            "The Flash",
            "The fastest man alive.",
            "Drama, Sci-Fi & Fantasy",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "October 7, 2014",
            "https://www.themoviedb.org/tv/60735-the-flash/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_naruto_shipudden,
            "Naruto Shippūden",
            "",
            "Animation, Action & Adventure, Sci-Fi & Fantasy",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "February 15, 2007",
            "https://www.themoviedb.org/tv/31910/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_riverdale,
            "Riverdale",
            "Small town. Big secrets.",
            "Mystery, Drama, Crime",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "January 26, 2017",
            "https://www.themoviedb.org/tv/69050-riverdale/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_shameless,
            "Shameless",
            "The Gallaghers. Absolutely, Wildly, Unapologetically... Shameless",
            "Drama, Comedy",
            "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
            "January 9, 2011",
            ""))
        tvshow.add(TVShowEntity(R.drawable.poster_supergirl,
            "Supergirl",
            "A force against fear",
            "Drama, Sci-Fi & Fantasy, Action & Adventure",
            "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
            "October 26, 2015",
            "https://www.themoviedb.org/tv/62688-supergirl/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_the_simpson,
            "The Simpsons",
            "On your marks, get set, d'oh!",
            "Family, Animation, Comedy",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "December 17, 1989",
            "https://www.themoviedb.org/tv/456-the-simpsons/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_the_umbrella,
            "The Umbrella Academy",
            "Super. Dysfunctional. Family.",
            "Action & Adventure, Sci-Fi & Fantasy, Drama",
            "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
            "February 15, 2019",
            "https://www.themoviedb.org/tv/75006-the-umbrella-academy/watch"))
        tvshow.add(TVShowEntity(R.drawable.poster_the_walking_dead,
            "The Walking Dead",
            "Fight the dead. Fear the living.",
            "Action & Adventure, Drama, Sci-Fi & Fantasy\n",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "October 31, 2010",
            "https://www.themoviedb.org/tv/1402-the-walking-dead/watch"))

        return tvshow
    }
}