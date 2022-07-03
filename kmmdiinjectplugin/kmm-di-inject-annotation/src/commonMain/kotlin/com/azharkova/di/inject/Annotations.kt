
package com.azharkova.di.inject

import kotlin.reflect.KClass

@Retention(AnnotationRetention.SOURCE)
public annotation class InjectService

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
public annotation class Container

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
public annotation class Single

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
public annotation class InstallIn(val container: KClass<*>)
