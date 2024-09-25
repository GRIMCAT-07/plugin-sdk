package app.kotatsu.plugin.sdk.core

import java.util.EnumSet
import java.util.Locale

public data class MangaListFilterOptions(

    /**
     * Available tags (genres)
     */
    public val availableTags: Set<MangaTag> = emptySet(),

    /**
     * Supported [MangaState] variants for filtering. May be empty.
     *
     * For better performance use [EnumSet] for more than one item.
     */
    public val availableStates: Set<MangaState> = emptySet(),

    /**
     * Supported [ContentRating] variants for filtering. May be empty.
     *
     * For better performance use [EnumSet] for more than one item.
     */
    public val availableContentRating: Set<ContentRating> = emptySet(),

    /**
     * Supported [ContentType] variants for filtering. May be empty.
     *
     * For better performance use [EnumSet] for more than one item.
     */
    public val availableContentTypes: Set<ContentType> = emptySet(),

    /**
     * Supported [Demographic] variants for filtering. May be empty.
     *
     * For better performance use [EnumSet] for more than one item.
     */
    public val availableDemographics: Set<Demographic> = emptySet(),

    /**
     * Supported content locales for multilingual sources
     */
    public val availableLocales: Set<Locale> = emptySet(),
)
