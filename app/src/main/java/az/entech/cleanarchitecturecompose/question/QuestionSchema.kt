package az.entech.cleanarchitecturecompose.question

import az.entech.cleanarchitecturecompose.user.UserSchema
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuestionSchema(
    @Json(name = "title") val title: String,
    @Json(name = "question_id") val id: String,
    @Json(name = "owner") val owner: UserSchema,
)