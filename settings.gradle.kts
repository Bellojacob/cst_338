rootProject.name = "cst338"
include("hw")
include("hw:hw1")
findProject(":hw:hw1")?.name = "hw1"
include("labs")
include("labs:lab2")
findProject(":labs:lab2")?.name = "lab2"
include("labs:lab3")
findProject(":labs:lab3")?.name = "lab3"
