/*
 * Nextcloud Talk - Android Client
 *
 * SPDX-FileCopyrightText: 2022 Nextcloud GmbH
 * SPDX-FileCopyrightText: 2022 Álvaro Brey <alvaro@alvarobrey.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.nextcloud.talk.test.fakes

import com.nextcloud.talk.models.domain.StartCallRecordingModel
import com.nextcloud.talk.models.domain.StopCallRecordingModel
import com.nextcloud.talk.repositories.callrecording.CallRecordingRepository
import io.reactivex.Observable

class FakeCallRecordingRepository : CallRecordingRepository {

    override fun startRecording(roomToken: String): Observable<StartCallRecordingModel> {
        return Observable.just(StartCallRecordingModel(true))
    }

    override fun stopRecording(roomToken: String): Observable<StopCallRecordingModel> {
        return Observable.just(StopCallRecordingModel(true))
    }
}
