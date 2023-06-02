// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package br.com.aula.petsave.common.`data`.api.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ApiPhotoSizesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ApiPhotoSizes>() {
  private val options: JsonReader.Options = JsonReader.Options.of("small", "medium", "large",
      "full")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "small")

  public override fun toString(): String = buildString(35) {
      append("GeneratedJsonAdapter(").append("ApiPhotoSizes").append(')') }

  public override fun fromJson(reader: JsonReader): ApiPhotoSizes {
    var small: String? = null
    var medium: String? = null
    var large: String? = null
    var full: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> small = nullableStringAdapter.fromJson(reader)
        1 -> medium = nullableStringAdapter.fromJson(reader)
        2 -> large = nullableStringAdapter.fromJson(reader)
        3 -> full = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ApiPhotoSizes(
        small = small,
        medium = medium,
        large = large,
        full = full
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ApiPhotoSizes?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("small")
    nullableStringAdapter.toJson(writer, value_.small)
    writer.name("medium")
    nullableStringAdapter.toJson(writer, value_.medium)
    writer.name("large")
    nullableStringAdapter.toJson(writer, value_.large)
    writer.name("full")
    nullableStringAdapter.toJson(writer, value_.full)
    writer.endObject()
  }
}
