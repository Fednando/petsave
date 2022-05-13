package br.com.aula.petsave.common.domain.model.animal

import org.threeten.bp.LocalDateTime


class Animal(
    val id: Long,
    val name: String,
    val type: String,
    val media: Media,
    val tags: List<String>,
    val adoptionStatus: AdoptionStatus,
    val publishedAt: LocalDateTime,
)