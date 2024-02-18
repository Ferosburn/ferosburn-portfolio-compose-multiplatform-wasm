package data.local

import data.model.Link
import data.model.Language
import data.model.Project
import ferosburnportofolio.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
val projectsData = listOf(
    Project(
        projectName = "Github User",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/github-user",
                description = "repository",
            )
        ),
        platform = "Mobile (Android)",
        languages = listOf(
            Language(
                name = "Kotlin",
                icon = Res.drawable.ic_kotlin
            )
        ),
        date = "Februari 2024",
        images = listOf(), // TODO: add the images
        description = "Submission untuk kelas Dicoding Belajar Fundamental Aplikasi Android",
        isHighlighted = true
    ),
    Project(
        projectName = "Open Music API",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/open-music-api",
                description = "repository",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/open-music-api-queue-consumer",
                description = "repository (consumer)",
            )
        ),
        platform = "Web (Server)",
        languages = listOf(
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        frameworksLibraries = listOf("NodeJS", "Hapi", "Postgresql", "Redis", "RabbitMQ"),
        date = "Desember 2023",
        images = listOf(), // TODO: add the images
        description = "Submission api untuk kelas Dicoding Belajar Fundamental Aplikasi Back-End",
    ),
    Project(
        projectName = "Jajan Mania",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/jajanmania-mobile",
                description = "repository",
            )
        ),
        platform = "Mobile (Android)",
        languages = listOf(
            Language(
                name = "Kotlin",
                icon = Res.drawable.ic_kotlin
            ),
        ),
        frameworksLibraries = listOf("Jetpack Compose", "Gson", "Retrofit", "Coil", "Material3"),
        date = "November 2023",
        images = listOf(), // TODO: add the images
        description = "Sebuah aplikasi android yang memudahkan pembeli menemukan pedagang " +
                "kaki lima favoritnya. Capstone Project Generasi Gigih 3.0 by GoTo Impact " +
                "Foundation dengan Toko Dizital sebagai industry partner.",
        isHighlighted = true
    ),
    Project(
        projectName = "Data Bencana",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/GG-3-0-Mobile-Engineering/ME14-DataBencana-GG3MEGP0594-SuudiKhoirulAnam",
                description = "repository",
            )
        ),
        platform = "Mobile (Android)",
        languages = listOf(
            Language(
                name = "Kotlin",
                icon = Res.drawable.ic_kotlin
            ),
        ),
        frameworksLibraries = listOf("Osmdroid", "Moshi", "Retrofit", "Room", "Coil", "Hilt"),
        date = "Agustus 2023",
        images = listOf(), // TODO: add the images
        description = "Sebuah aplikasi android yang menampilkan data bencana-bencana yang " +
                "ada di Indonesia. Aplikasi ini menggunakan data dari API PetaBencana.id. " +
                "Tugas akhir individu sesi kelas Generasi Gigih 3.0 by GoTo Impact Foundation.",
        isHighlighted = true
    ),
    Project(
        projectName = "To Do List App",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://to-do-list-ferosburn.vercel.app/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/to-do-list",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        frameworksLibraries = listOf("ReactJS", "vite", "react-dom", "Tailwind"),
        date = "Mei 2023",
        images = listOf(), // TODO: add the images
        description = "Hasil dari devcode challenge react js",
        isHighlighted = true
    ),
    Project(
        projectName = "My Bookshelf (Android)",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/android-my-bookshelf",
                description = "repository",
            )
        ),
        platform = "Mobile (Android)",
        languages = listOf(
            Language(
                name = "Kotlin",
                icon = Res.drawable.ic_kotlin
            )
        ),
        date = "Maret 2023",
        images = listOf(), // TODO: add the images
        description = "Submission untuk kelas Dicoding Belajar Membuat Aplikasi Android untuk Pemula",
    ),
    Project(
        projectName = "Random Quote Machine",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://ferosburn.github.io/random-quote-machine/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/random-quote-machine",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        frameworksLibraries = listOf("ReactJS"),
        date = "Maret 2023",
        images = listOf(), // TODO: add the images
        description = "Sebuah halaman web yang dapat menghasilkan kutipan secara random dan " +
                "dapat membagikan ke twitter sebagai sebuah tweet. Submission untuk Front End " +
                "Development Libraries Projects dari freeCodeCamp",
    ),
    Project(
        projectName = "Bookshelf API",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/bookshelf-api",
                description = "repository",
            )
        ),
        platform = "Web (Server)",
        languages = listOf(
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        frameworksLibraries = listOf("NodeJS", "Hapi"),
        date = "Februari 2023",
        images = listOf(), // TODO: add the images
        description = "Submission api untuk kelas Dicoding Belajar Membuat Aplikasi Back-End " +
                "untuk Pemula",
    ),
    Project(
        projectName = "Skilvul UI",
        links = listOf(
            Link(
                icon = Res.drawable.ic_figma,
                link = "https://www.figma.com/file/shM2nG7UIjTM3sANszc0fK/Lomba-UI%2FUX-IAA-" +
                        "UKDW-x-Skilvul?node-id=0%3A1&t=6YtAr1Fu26sKwjke-1",
                description = "figma",
            )
        ),
        date = "Juli 2022",
        images = listOf(), // TODO: add the images
        description = "Submission desain UI homepage website Skilvul untuk lomba UI/UX IAA " +
                "UKDW x Skilvul 2022",
    ),
    Project(
        projectName = "Bookshelf App",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://ferosburn.github.io/book-shelf/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/book-shelf",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        date = "Juli 2022",
        images = listOf(), // TODO: add the images
        description = "Submission webpage untuk kelas Dicoding Belajar Membuat Front-End Web " +
                "untuk Pemula",
    ),
    Project(
        projectName = "To-Do-List",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://ferosburn.github.io/todo-list/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/todo-list",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        frameworksLibraries = listOf("ReactJS"),
        date = "Juni 2023",
        images = listOf(), // TODO: add the images
        description = "Proyek pribadi dibuat untuk memenuhi tugas membuat todo-list " +
                "menggunakan framework ReactJS dari pelatihan DTS FGA Progate ReactJS for " +
                "Web Development.",
    ),
    Project(
        projectName = "Kalkulator",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://ferosburn.github.io/kalkulator/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/kalkulator",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "JavaScript",
                icon = Res.drawable.ic_javascript
            ),
        ),
        date = "Juni 2022",
        images = listOf(), // TODO: add the images
        description = "Proyek pribadi dibuat untuk memenuhi tugas membuat kalkulator " +
                "menggunakan JavaScript dari pelatihan DTS FGA Progate ReactJS for Web " +
                "Development.",
    ),
    Project(
        projectName = "UndangApp",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/undangapp",
                description = "repository",
            )
        ),
        platform = "Web (Fullstack)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
            Language(
                name = "Ruby",
                icon = Res.drawable.ic_ruby
            ),
        ),
        frameworksLibraries = listOf("Ruby on Rails", "Bootstrap"),
        date = "April 2022",
        images = listOf(), // TODO: add the images
        description = "Proyek pribadi iseng setelah melakukan pelatihan DTS FGA Progate " +
                "Full Stack Developer with Ruby (HTML, CSS, Ruby, Ruby on Rails). Saya " +
                "membuat proyek ini untuk mengukur dan mengembangkan kemampuan saya dalam " +
                "membuat sebuah web app.",
    ),
    Project(
        projectName = "Masakan Nusantara",
        links = listOf(
            Link(
                icon = Res.drawable.ic_link,
                link = "https://ferosburn.github.io/masakan-nusantara/",
                description = "live page",
            ),
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/masakan-nusantara",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
        ),
        date = "Maret 2022",
        images = listOf(), // TODO: add the images
        description = "Proyek ini dikerjakan secara tim dan dibuat untuk tugas HTML dan CSS " +
                "dari pelatihan DTS FGA Progate Full Stack Developer with Ruby (HTML, CSS, " +
                "Ruby, Ruby on Rails).",
    ),
    Project(
        projectName = "Portofolio",
        links = listOf(
            Link(
                icon = Res.drawable.ic_github,
                link = "https://github.com/Ferosburn/ferosburn-portofolio",
                description = "repository",
            )
        ),
        platform = "Web (Client)",
        languages = listOf(
            Language(
                name = "HTML",
                icon = Res.drawable.ic_html
            ),
            Language(
                name = "CSS",
                icon = Res.drawable.ic_css
            ),
        ),
        date = "September 2022",
        images = listOf(), // TODO: add the images
        description = "Tugas akhir individu untuk pelatihan dari Kode ID Belajar Langkah " +
                "Fundamental untuk Menjadi Web Developer",
    ),
)