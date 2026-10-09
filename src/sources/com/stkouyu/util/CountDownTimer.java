package com.stkouyu.util;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CountDownTimer {
    private static final int MSG = 1;
    private final long mCountdownInterval;
    private long mElapsedRealtime;
    private Handler mHandler;
    private final long mMillisInFuture;
    private long mMillisFinished = 0;
    private boolean mCancelled = false;

    public CountDownTimer(long j11, long j12) {
        this.mMillisInFuture = j11;
        this.mCountdownInterval = j12;
        createHandle();
    }

    private void createHandle() {
        this.mHandler = new Handler() { // from class: com.stkouyu.util.CountDownTimer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                synchronized (CountDownTimer.this) {
                    try {
                        if (CountDownTimer.this.mCancelled) {
                            return;
                        }
                        long j11 = CountDownTimer.this.mElapsedRealtime;
                        CountDownTimer.this.mElapsedRealtime = SystemClock.elapsedRealtime();
                        CountDownTimer.this.mMillisFinished += CountDownTimer.this.mElapsedRealtime - j11;
                        if (CountDownTimer.this.mMillisInFuture <= CountDownTimer.this.mMillisFinished) {
                            CountDownTimer countDownTimer = CountDownTimer.this;
                            countDownTimer.onFinish(countDownTimer.mMillisFinished);
                        } else {
                            CountDownTimer countDownTimer2 = CountDownTimer.this;
                            countDownTimer2.onTick(countDownTimer2.mMillisFinished);
                            long jElapsedRealtime = CountDownTimer.this.mMillisInFuture - CountDownTimer.this.mMillisFinished;
                            if (jElapsedRealtime > CountDownTimer.this.mCountdownInterval) {
                                jElapsedRealtime = ((CountDownTimer.this.mElapsedRealtime + CountDownTimer.this.mCountdownInterval) - SystemClock.elapsedRealtime()) - (CountDownTimer.this.mMillisFinished % CountDownTimer.this.mCountdownInterval);
                            }
                            while (jElapsedRealtime < 0) {
                                jElapsedRealtime += CountDownTimer.this.mCountdownInterval;
                            }
                            sendMessageDelayed(obtainMessage(1), jElapsedRealtime);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    public final synchronized void cancel() {
        this.mCancelled = true;
        this.mHandler.removeMessages(1);
    }

    public final synchronized long getNowTime() {
        return (this.mMillisFinished + SystemClock.elapsedRealtime()) - this.mElapsedRealtime;
    }

    public final synchronized boolean isCancelled() {
        return this.mCancelled;
    }

    public abstract void onFinish(long j11);

    public abstract void onTick(long j11);

    public final synchronized CountDownTimer start() {
        this.mCancelled = false;
        long j11 = this.mMillisInFuture;
        long j12 = this.mMillisFinished;
        if (j11 <= j12) {
            onFinish(j12);
            return this;
        }
        this.mElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final synchronized CountDownTimer stop() {
        this.mHandler.removeMessages(1);
        long j11 = this.mElapsedRealtime;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mElapsedRealtime = jElapsedRealtime;
        long j12 = this.mMillisFinished + (jElapsedRealtime - j11);
        this.mMillisFinished = j12;
        onTick(j12);
        return this;
    }
}
