package br.com.aula.petsave.common.data.api

object ApiConstants {
  const val BASE_ENDPOINT = "https://api.petfinder.com/v2/"
  const val AUTH_ENDPOINT = "oauth2/token/"
  const val ANIMALS_ENDPOINT = "animals"

  const val KEY = "m5Oy1aslbr9MxGY0ZfjYGLe5NSmKOaqGFCcE7yoMJ2s3SIMSBZ"
  const val SECRET = "qbL1joWwrYmyePmPXmU0oq50sqiTazPbMMycm88k"
}

object ApiParameters {
  const val TOKEN_TYPE = "Bearer "
  const val AUTH_HEADER = "Authorization"
  const val GRANT_TYPE_KEY = "grant_type"
  const val GRANT_TYPE_VALUE = "client_credentials"
  const val CLIENT_ID = "client_id"
  const val CLIENT_SECRET = "client_secret"

  const val PAGE = "page"
  const val LIMIT = "limit"
  const val LOCATION = "location"
  const val DISTANCE = "distance"
  const val NAME = "name"
  const val AGE = "age"
  const val TYPE = "type"
}