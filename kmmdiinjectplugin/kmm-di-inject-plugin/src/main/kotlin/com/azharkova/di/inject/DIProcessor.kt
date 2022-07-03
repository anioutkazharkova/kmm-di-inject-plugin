package com.azharkova.di.inject

import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid

class DIProcessor(val pluginContext: IrPluginContext) : IrElementVisitorVoid {
    override fun visitElement(element: IrElement) {
        element.acceptChildren(this, null)
    }
}