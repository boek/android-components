/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.browser.search

interface SearchEngineSuggestionProvider {
    fun getSuggestions(query: String, callback: (List<String>) -> Void)
}

sealed class SuggestionProvider: SearchEngineSuggestionProvider
class NoAvailableSuggestionProvider internal constructor(): SuggestionProvider()
class ApiSuggestionProvider internal constructor(val searchEngine: SearchEngine) : SuggestionProvider() {

}