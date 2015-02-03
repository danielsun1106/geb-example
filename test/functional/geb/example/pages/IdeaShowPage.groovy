package geb.example.pages

class IdeaShowPage extends geb.Page {
  static at = { $("div#show-idea").displayed }

  static content = {
    titleValueElement { $("span#titleValue") }
    descriptionValueElement { $("span#descriptionValue") }
  }

  String getTitleText() {
    titleValueElement.text()
  }

  String getDescriptionText() {
    descriptionValueElement.text()
  }
}
