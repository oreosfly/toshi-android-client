/*
 * 	Copyright (c) 2017. Toshi Inc
 *
 * 	This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.toshi.view.custom

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.toshi.extensions.addHorizontalLineDivider

class SkipDividersRecyclerView : RecyclerView {
    constructor(context: Context): super(context) {
        init()
    }
    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        init()
    }
    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        init()
    }

    private var horizontalLineDivider: HorizontalLineDivider? = null

    private fun init() {
        horizontalLineDivider = addHorizontalLineDivider()
    }

    fun setDividerStartPosition(startPosition: Int) {
        removeHorizontalDivider()
        horizontalLineDivider = addHorizontalLineDivider(startPosition = startPosition)
    }

    private fun removeHorizontalDivider() = horizontalLineDivider?.let { removeItemDecoration(it) }
}