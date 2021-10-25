package com.samuelvazquez.write_files

File myFile = new File("dataA.txt")

myFile.write("This is Line 1")
myFile << "\nThis is Line 2"
myFile.text = "This is Line 3"
myFile.withWriter {writer -> writer.writeLine("This is Line 4")}

myFile.append("This is Line 5")

println myFile.length() // size in bytes
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()

def newFile = new File("dataB.txt")
newFile << myFile.text

myFile.bytes = []

myFile.renameTo(new File("newFile.txt"))

// myFile.delete()



