import SwiftUI
import accountDomain


struct ContentView: View {
    var specificString = Account().specificString

	var body: some View {
		Text(specificString)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
