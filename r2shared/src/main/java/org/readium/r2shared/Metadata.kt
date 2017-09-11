package org.readium.r2shared

import java.util.*

class Metadata{

    /// The structure used for the serialisation.
    var multilangTitle: MultilangString? = null
    /// The title of the publication.
    var title: String = ""
        get() = multilangTitle?.singleString ?: ""

    var languages: MutableList<String> = mutableListOf()
    var identifier: String? = null
    // Contributors.
    var authors: MutableList<Contributor> = mutableListOf()
    var translators: MutableList<Contributor> = mutableListOf()
    var editors: MutableList<Contributor> = mutableListOf()
    var artists: MutableList<Contributor> = mutableListOf()
    var illustrators: MutableList<Contributor> = mutableListOf()
    var letterers: MutableList<Contributor> = mutableListOf()
    var pencilers: MutableList<Contributor> = mutableListOf()
    var colorists: MutableList<Contributor> = mutableListOf()
    var inkers: MutableList<Contributor> = mutableListOf()
    var narrators: MutableList<Contributor> = mutableListOf()
    var imprints: MutableList<Contributor> = mutableListOf()
    var direction:String = "default"
    var subjects: MutableList<Contributor> = mutableListOf()
    var publishers: MutableList<Contributor> = mutableListOf()
    var contributors: MutableList<Contributor> = mutableListOf()
    var modified: String? = null
    var publicationDate: String? = null
    var description: String? = null
    var rendition:Rendition = Rendition()
    var source: String? = null
    var epubType: MutableList<String> = mutableListOf()
    var rights: String? = null
    var otherMetadata: MutableList<MetadataItem> = mutableListOf()

    fun titleForLang(key: String) : String? {
        return multilangTitle?.multiString?.get(key)
    }
}