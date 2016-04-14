import javafx.geometry.Insets
import javafx.scene.layout.HBox
import tornadofx.App
import tornadofx.View
import tornadofx.label


class HelloWorld : View() {
  override val root = HBox()

  init {
    with(root) {
      padding = Insets(50.0)
      label("Hello world")
    }
  }
}


class HelloWorldApp : App() {
  override val primaryView = HelloWorld::class
}

