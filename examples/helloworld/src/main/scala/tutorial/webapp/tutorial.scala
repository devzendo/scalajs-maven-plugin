package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document

object TutorialApp {
    def appendPar(targetNode: dom.Node, text: String): Unit = {
        val parNode = document.createElement("p")
        val textNode = document.createTextNode(text)
        parNode.appendChild(textNode)
        targetNode.appendChild(parNode)
    }

    def main(args: Array[String]): Unit = {
        println("to the console")
        appendPar(document.body, "Hello World")
    }
}