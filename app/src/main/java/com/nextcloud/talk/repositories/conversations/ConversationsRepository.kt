/*
 * Nextcloud Talk - Android Client
 *
 * SPDX-FileCopyrightText: 2022 Tim Krüger <t@timkrueger.me>
 * SPDX-FileCopyrightText: 2022 Nextcloud GmbH
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.nextcloud.talk.repositories.conversations

import io.reactivex.Observable

interface ConversationsRepository {

    data class AllowGuestsResult(
        val allow: Boolean
    )

    fun allowGuests(token: String, allow: Boolean): Observable<AllowGuestsResult>

    data class PasswordResult(
        val passwordSet: Boolean,
        val passwordIsWeak: Boolean,
        val message: String
    )

    fun password(password: String, token: String): Observable<PasswordResult>

    data class ResendInvitationsResult(
        val successful: Boolean
    )
    fun resendInvitations(token: String): Observable<ResendInvitationsResult>
}
