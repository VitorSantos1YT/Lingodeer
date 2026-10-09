package com.stkouyu;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.stkouyu.lame.SimpleLame;
import com.stkouyu.listener.OnSTRecorderListener;
import com.stkouyu.util.CountDownTimer;
import com.stkouyu.util.DeviceUtils;
import com.stkouyu.util.MyLog;
import com.stkouyu.util.MyUtil;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class STRecorder {
    private static int BITS = 16;
    private static int CHANNELS = 1;
    private static int FREQUENCY = 16000;
    private static int INTERVAL = 30;
    private static String TAG = "STRecorder";
    private static volatile ExecutorService fixedThreadPoolInstance;
    private static STRecorder instance;
    private static int threadsize;
    private boolean bMute;
    private Integer chunkSize;
    private boolean isRecordCancel;
    private int mAudioSource;
    private String mAudioType;
    private Callback mCallback;
    private Context mContext;
    private Handler mHandler;
    private OnSTRecorderListener mOnSTRecorderListener;
    public PlayBackTask mPlayBackTask;
    private CountDownTimer mPlaybackTimer;
    private RecordTask mRecordTask;
    private long playBackDuration;
    private int totalFrames;
    private AudioRecord recorder = null;
    private AudioTrack player = null;
    private MediaPlayer mMediaPlayer = null;
    private byte[] buffer = null;
    private int bufferSize = 0;
    private String path = null;
    public volatile boolean isRecording = false;
    private volatile boolean isPlaying = false;
    public volatile boolean mIsRecordPaused = false;
    public volatile boolean mIsReStartRecord = false;
    private boolean lameInited = false;
    private String mp3Path = null;
    private int minChunkSize = 320;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Callback {
        void run(byte[] bArr, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PlayBackTask extends AsyncTask<String, Integer, Void> {
        public PlayBackTask() {
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            super.onCancelled();
            if (STRecorder.this.mMediaPlayer != null) {
                STRecorder.this.mMediaPlayer.stop();
            }
            MyLog.e(STRecorder.TAG, "playback is cancled");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            STRecorder.threaddog();
            if (MyUtil.isNull(strArr[0])) {
                MyLog.e(STRecorder.TAG, "play path is null");
                return null;
            }
            if (isCancelled()) {
                return null;
            }
            return STRecorder.this.playBackFile(strArr[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RecordTask {
        private Future<?> mFuture;
        private boolean mIsCancelled;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:110:0x0223 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:111:0x0225 A[Catch: Exception -> 0x0214, TryCatch #3 {Exception -> 0x0214, blocks: (B:101:0x01f6, B:103:0x01fe, B:105:0x020a, B:108:0x0216, B:111:0x0225, B:113:0x022c), top: B:185:0x01f6 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x022c A[Catch: Exception -> 0x0214, TRY_LEAVE, TryCatch #3 {Exception -> 0x0214, blocks: (B:101:0x01f6, B:103:0x01fe, B:105:0x020a, B:108:0x0216, B:111:0x0225, B:113:0x022c), top: B:185:0x01f6 }] */
        /* JADX WARN: Code duplicated, block: B:118:0x0244  */
        /* JADX WARN: Code duplicated, block: B:137:0x02c2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:138:0x02c4 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:128:0x0295, B:130:0x029d, B:132:0x02a9, B:135:0x02b5, B:138:0x02c4, B:140:0x02cb), top: B:187:0x0295 }] */
        /* JADX WARN: Code duplicated, block: B:140:0x02cb A[Catch: Exception -> 0x02b3, TRY_LEAVE, TryCatch #4 {Exception -> 0x02b3, blocks: (B:128:0x0295, B:130:0x029d, B:132:0x02a9, B:135:0x02b5, B:138:0x02c4, B:140:0x02cb), top: B:187:0x0295 }] */
        /* JADX WARN: Code duplicated, block: B:145:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:159:0x032a A[Catch: Exception -> 0x0340, TryCatch #7 {Exception -> 0x0340, blocks: (B:157:0x0322, B:159:0x032a, B:161:0x0336, B:164:0x0342, B:167:0x0351, B:169:0x0358), top: B:189:0x0322 }] */
        /* JADX WARN: Code duplicated, block: B:166:0x034f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:167:0x0351 A[Catch: Exception -> 0x0340, TryCatch #7 {Exception -> 0x0340, blocks: (B:157:0x0322, B:159:0x032a, B:161:0x0336, B:164:0x0342, B:167:0x0351, B:169:0x0358), top: B:189:0x0322 }] */
        /* JADX WARN: Code duplicated, block: B:169:0x0358 A[Catch: Exception -> 0x0340, TRY_LEAVE, TryCatch #7 {Exception -> 0x0340, blocks: (B:157:0x0322, B:159:0x032a, B:161:0x0336, B:164:0x0342, B:167:0x0351, B:169:0x0358), top: B:189:0x0322 }] */
        /* JADX WARN: Code duplicated, block: B:174:0x0370  */
        /* JADX WARN: Code duplicated, block: B:177:0x0381  */
        /* JADX WARN: Code duplicated, block: B:205:0x0139 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:209:0x0119 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:228:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[Catch: all -> 0x00df, Exception -> 0x00e4, TryCatch #10 {Exception -> 0x00e4, all -> 0x00df, blocks: (B:40:0x00ad, B:42:0x00be, B:44:0x00c4, B:46:0x00d5, B:51:0x00e8, B:53:0x00f5, B:54:0x00f9, B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012d, B:64:0x013b, B:68:0x0154, B:69:0x015f, B:71:0x0167, B:73:0x016d, B:75:0x0178, B:77:0x017f, B:79:0x0187, B:80:0x018d, B:82:0x0195, B:84:0x019b, B:86:0x01a1, B:88:0x01ad, B:90:0x01b5, B:92:0x01bb, B:94:0x01c6, B:96:0x01cd, B:98:0x01d5), top: B:200:0x00ad }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00f5 A[Catch: all -> 0x00df, Exception -> 0x00e4, TryCatch #10 {Exception -> 0x00e4, all -> 0x00df, blocks: (B:40:0x00ad, B:42:0x00be, B:44:0x00c4, B:46:0x00d5, B:51:0x00e8, B:53:0x00f5, B:54:0x00f9, B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012d, B:64:0x013b, B:68:0x0154, B:69:0x015f, B:71:0x0167, B:73:0x016d, B:75:0x0178, B:77:0x017f, B:79:0x0187, B:80:0x018d, B:82:0x0195, B:84:0x019b, B:86:0x01a1, B:88:0x01ad, B:90:0x01b5, B:92:0x01bb, B:94:0x01c6, B:96:0x01cd, B:98:0x01d5), top: B:200:0x00ad }] */
        /* JADX WARN: Code duplicated, block: B:64:0x013b A[Catch: all -> 0x00df, Exception -> 0x00e4, TryCatch #10 {Exception -> 0x00e4, all -> 0x00df, blocks: (B:40:0x00ad, B:42:0x00be, B:44:0x00c4, B:46:0x00d5, B:51:0x00e8, B:53:0x00f5, B:54:0x00f9, B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012d, B:64:0x013b, B:68:0x0154, B:69:0x015f, B:71:0x0167, B:73:0x016d, B:75:0x0178, B:77:0x017f, B:79:0x0187, B:80:0x018d, B:82:0x0195, B:84:0x019b, B:86:0x01a1, B:88:0x01ad, B:90:0x01b5, B:92:0x01bb, B:94:0x01c6, B:96:0x01cd, B:98:0x01d5), top: B:200:0x00ad }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0151  */
        /* JADX WARN: Code duplicated, block: B:67:0x0153  */
        /* JADX WARN: Code duplicated, block: B:75:0x0178 A[Catch: all -> 0x00df, Exception -> 0x00e4, TryCatch #10 {Exception -> 0x00e4, all -> 0x00df, blocks: (B:40:0x00ad, B:42:0x00be, B:44:0x00c4, B:46:0x00d5, B:51:0x00e8, B:53:0x00f5, B:54:0x00f9, B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012d, B:64:0x013b, B:68:0x0154, B:69:0x015f, B:71:0x0167, B:73:0x016d, B:75:0x0178, B:77:0x017f, B:79:0x0187, B:80:0x018d, B:82:0x0195, B:84:0x019b, B:86:0x01a1, B:88:0x01ad, B:90:0x01b5, B:92:0x01bb, B:94:0x01c6, B:96:0x01cd, B:98:0x01d5), top: B:200:0x00ad }] */
        /* JADX WARN: Code duplicated, block: B:94:0x01c6 A[Catch: all -> 0x00df, Exception -> 0x00e4, TryCatch #10 {Exception -> 0x00e4, all -> 0x00df, blocks: (B:40:0x00ad, B:42:0x00be, B:44:0x00c4, B:46:0x00d5, B:51:0x00e8, B:53:0x00f5, B:54:0x00f9, B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012d, B:64:0x013b, B:68:0x0154, B:69:0x015f, B:71:0x0167, B:73:0x016d, B:75:0x0178, B:77:0x017f, B:79:0x0187, B:80:0x018d, B:82:0x0195, B:84:0x019b, B:86:0x01a1, B:88:0x01ad, B:90:0x01b5, B:92:0x01bb, B:94:0x01c6, B:96:0x01cd, B:98:0x01d5), top: B:200:0x00ad }] */
        public void doRecordTask() throws Throwable {
            Throwable th2;
            RandomAccessFile randomAccessFileFopen;
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFileFopen2;
            int i11;
            byte[] bArr;
            boolean z11;
            int i12;
            int i13;
            boolean z12;
            String str = "record is stoped";
            String str2 = " record recording status :: ";
            try {
                if (STRecorder.this.path == null || STRecorder.this.mIsReStartRecord) {
                    try {
                        try {
                            if (STRecorder.this.mIsReStartRecord) {
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(STRecorder.this.path), "rw");
                                try {
                                    randomAccessFile2.seek(randomAccessFile2.length());
                                    if (STRecorder.this.mAudioType.equals(AudioType.MP3)) {
                                        randomAccessFile = new RandomAccessFile(new File(STRecorder.this.mp3Path), "rw");
                                        try {
                                            randomAccessFile.seek(randomAccessFile.length());
                                            randomAccessFileFopen = randomAccessFile2;
                                            randomAccessFileFopen2 = randomAccessFile;
                                        } catch (Exception e8) {
                                            e = e8;
                                            randomAccessFileFopen = randomAccessFile2;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            randomAccessFileFopen = randomAccessFile2;
                                            STRecorder.this.isRecording = false;
                                            MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                                            try {
                                                if (STRecorder.this.recorder != null) {
                                                    STRecorder.this.recorder.stop();
                                                }
                                                MyLog.e(STRecorder.TAG, str);
                                                if (!STRecorder.this.mIsRecordPaused) {
                                                    if (randomAccessFileFopen != null) {
                                                        STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                                                    }
                                                    if (randomAccessFile != null) {
                                                        STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                MyLog.e(STRecorder.TAG, "===>ST Exception");
                                                e10.printStackTrace();
                                            }
                                            if (STRecorder.this.bMute) {
                                                DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                                            }
                                            if (STRecorder.this.recorder != null) {
                                                throw th2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        randomAccessFileFopen = randomAccessFile2;
                                        randomAccessFileFopen2 = null;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    randomAccessFileFopen = randomAccessFile2;
                                    randomAccessFile = null;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    randomAccessFileFopen = randomAccessFile2;
                                    randomAccessFile = null;
                                    STRecorder.this.isRecording = false;
                                    MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                                    if (STRecorder.this.recorder != null) {
                                        STRecorder.this.recorder.stop();
                                    }
                                    MyLog.e(STRecorder.TAG, str);
                                    if (!STRecorder.this.mIsRecordPaused) {
                                        if (randomAccessFileFopen != null) {
                                            STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                                        }
                                        if (randomAccessFile != null) {
                                            STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                                        }
                                    }
                                    if (STRecorder.this.bMute) {
                                        DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                                    }
                                    if (STRecorder.this.recorder != null) {
                                        throw th2;
                                    }
                                    throw th2;
                                }
                                try {
                                    MyLog.e(STRecorder.TAG, "===>ST Exception");
                                    e.printStackTrace();
                                    STRecorder.this.isRecording = false;
                                    MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                                    try {
                                        if (STRecorder.this.recorder != null && STRecorder.this.recorder.getRecordingState() != 3) {
                                            STRecorder.this.recorder.stop();
                                        }
                                        MyLog.e(STRecorder.TAG, str);
                                        if (!STRecorder.this.mIsRecordPaused) {
                                            if (randomAccessFileFopen != null) {
                                                STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                                            }
                                            if (randomAccessFile != null) {
                                                STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                                            }
                                        }
                                    } catch (Exception e12) {
                                        MyLog.e(STRecorder.TAG, "===>ST Exception");
                                        e12.printStackTrace();
                                    }
                                    if (STRecorder.this.bMute) {
                                        DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                                    }
                                    if (STRecorder.this.recorder != null || isCancelled() || STRecorder.this.mCallback == null) {
                                        return;
                                    }
                                    STRecorder.this.mCallback.run(null, -1);
                                    return;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    STRecorder.this.isRecording = false;
                                    MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                                    if (STRecorder.this.recorder != null && STRecorder.this.recorder.getRecordingState() != 3) {
                                        STRecorder.this.recorder.stop();
                                    }
                                    MyLog.e(STRecorder.TAG, str);
                                    if (!STRecorder.this.mIsRecordPaused) {
                                        if (randomAccessFileFopen != null) {
                                            STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                                        }
                                        if (randomAccessFile != null) {
                                            STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                                        }
                                    }
                                    if (STRecorder.this.bMute) {
                                        DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                                    }
                                    if (STRecorder.this.recorder != null || isCancelled() || STRecorder.this.mCallback == null) {
                                        throw th2;
                                    }
                                    STRecorder.this.mCallback.run(null, -1);
                                    throw th2;
                                }
                            }
                            randomAccessFileFopen2 = null;
                            randomAccessFileFopen = null;
                            if (STRecorder.this.recorder != null && STRecorder.this.recorder.getRecordingState() != 3) {
                                STRecorder.this.recorder.stop();
                            }
                            MyLog.e(STRecorder.TAG, "record is stoped");
                            if (!STRecorder.this.mIsRecordPaused) {
                                if (randomAccessFileFopen != null) {
                                    STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                                }
                                if (randomAccessFileFopen2 != null) {
                                    STRecorder.this.fclose(randomAccessFileFopen2, AudioType.MP3);
                                }
                            }
                        } catch (Exception e13) {
                            str = STRecorder.TAG;
                            MyLog.e(str, "===>ST Exception");
                            e13.printStackTrace();
                        }
                        MyLog.e(STRecorder.TAG, "start record task");
                        if (STRecorder.this.recorder != null && !isCancelled()) {
                            STRecorder.this.recorder.startRecording();
                            if (STRecorder.this.mOnSTRecorderListener != null) {
                                STRecorder.this.mOnSTRecorderListener.onStart();
                            }
                        }
                        if (STRecorder.this.recorder.getRecordingState() == 3) {
                            STRecorder.this.isRecording = true;
                        }
                        MyLog.e(STRecorder.TAG, " record recording status1 :: " + STRecorder.this.isRecording);
                        i11 = STRecorder.this.bufferSize;
                        bArr = new byte[i11];
                        z11 = false;
                        while (STRecorder.this.recorder != null && STRecorder.this.isRecording && !isCancelled()) {
                            i13 = STRecorder.this.recorder.read(bArr, 0, i11);
                            if (i13 <= 0) {
                                if (!z11) {
                                    String str3 = STRecorder.TAG;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(" record recording callback :: ");
                                    if (STRecorder.this.mCallback != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    sb2.append(z12);
                                    MyLog.e(str3, sb2.toString());
                                    z11 = true;
                                }
                                if (STRecorder.this.mCallback != null && STRecorder.this.isRecording) {
                                    STRecorder.this.mCallback.run(bArr, i13);
                                }
                                if (randomAccessFileFopen != null) {
                                    STRecorder.this.fwrite(randomAccessFileFopen, bArr, 0, i13);
                                }
                                if (randomAccessFileFopen2 == null && STRecorder.this.lameInited) {
                                    STRecorder.this.fwrite(randomAccessFileFopen2, i13, bArr);
                                }
                            }
                        }
                        while (STRecorder.this.recorder != null && STRecorder.this.isRecording && !isCancelled() && (i12 = STRecorder.this.recorder.read(bArr, 0, i11)) > 0) {
                            if (STRecorder.this.mCallback != null && STRecorder.this.isRecording) {
                                STRecorder.this.mCallback.run(bArr, i12);
                            }
                            if (randomAccessFileFopen != null) {
                                STRecorder.this.fwrite(randomAccessFileFopen, bArr, 0, i12);
                            }
                            if (randomAccessFileFopen2 == null && STRecorder.this.lameInited) {
                                STRecorder.this.fwrite(randomAccessFileFopen2, i12, bArr);
                            }
                        }
                        STRecorder.this.isRecording = false;
                        String str4 = STRecorder.TAG;
                        str2 = " record recording status :: " + STRecorder.this.isRecording;
                        MyLog.e(str4, str2);
                        if (STRecorder.this.bMute) {
                            DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                        }
                        if (STRecorder.this.recorder != null || isCancelled() || STRecorder.this.mCallback == null) {
                        }
                    } catch (Exception e14) {
                        e = e14;
                        randomAccessFile = randomAccessFileFopen2;
                        MyLog.e(STRecorder.TAG, "===>ST Exception");
                        e.printStackTrace();
                        STRecorder.this.isRecording = false;
                        MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                        if (STRecorder.this.recorder != null) {
                            STRecorder.this.recorder.stop();
                        }
                        MyLog.e(STRecorder.TAG, str);
                        if (!STRecorder.this.mIsRecordPaused) {
                            if (randomAccessFileFopen != null) {
                                STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                            }
                            if (randomAccessFile != null) {
                                STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                            }
                        }
                        if (STRecorder.this.bMute) {
                            DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                        }
                        if (STRecorder.this.recorder != null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        randomAccessFile = randomAccessFileFopen2;
                        STRecorder.this.isRecording = false;
                        MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                        if (STRecorder.this.recorder != null) {
                            STRecorder.this.recorder.stop();
                        }
                        MyLog.e(STRecorder.TAG, str);
                        if (!STRecorder.this.mIsRecordPaused) {
                            if (randomAccessFileFopen != null) {
                                STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                            }
                            if (randomAccessFile != null) {
                                STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                            }
                        }
                        if (STRecorder.this.bMute) {
                            DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                        }
                        if (STRecorder.this.recorder != null) {
                            throw th2;
                        }
                        throw th2;
                    }
                    STRecorder.this.mCallback.run(null, -1);
                    return;
                }
                STRecorder sTRecorder = STRecorder.this;
                randomAccessFileFopen = sTRecorder.fopen(sTRecorder.path, AudioType.WAV);
                try {
                    if (STRecorder.this.mAudioType.equals(AudioType.MP3)) {
                        STRecorder sTRecorder2 = STRecorder.this;
                        randomAccessFileFopen2 = sTRecorder2.fopen(sTRecorder2.mp3Path, AudioType.MP3);
                    } else {
                        randomAccessFileFopen2 = null;
                    }
                    MyLog.e(STRecorder.TAG, "start record task");
                    if (STRecorder.this.recorder != null) {
                        STRecorder.this.recorder.startRecording();
                        if (STRecorder.this.mOnSTRecorderListener != null) {
                            STRecorder.this.mOnSTRecorderListener.onStart();
                        }
                    }
                    if (STRecorder.this.recorder.getRecordingState() == 3) {
                        STRecorder.this.isRecording = true;
                    }
                    MyLog.e(STRecorder.TAG, " record recording status1 :: " + STRecorder.this.isRecording);
                    i11 = STRecorder.this.bufferSize;
                    bArr = new byte[i11];
                    z11 = false;
                    while (STRecorder.this.recorder != null) {
                        i13 = STRecorder.this.recorder.read(bArr, 0, i11);
                        if (i13 <= 0) {
                            if (!z11) {
                                String str5 = STRecorder.TAG;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(" record recording callback :: ");
                                if (STRecorder.this.mCallback != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                sb3.append(z12);
                                MyLog.e(str5, sb3.toString());
                                z11 = true;
                            }
                            if (STRecorder.this.mCallback != null) {
                                STRecorder.this.mCallback.run(bArr, i13);
                            }
                            if (randomAccessFileFopen != null) {
                                STRecorder.this.fwrite(randomAccessFileFopen, bArr, 0, i13);
                            }
                            if (randomAccessFileFopen2 == null) {
                            }
                        }
                    }
                    while (STRecorder.this.recorder != null) {
                        if (STRecorder.this.mCallback != null) {
                            STRecorder.this.mCallback.run(bArr, i12);
                        }
                        if (randomAccessFileFopen != null) {
                            STRecorder.this.fwrite(randomAccessFileFopen, bArr, 0, i12);
                        }
                        if (randomAccessFileFopen2 == null) {
                        }
                    }
                    STRecorder.this.isRecording = false;
                    String str6 = STRecorder.TAG;
                    str2 = " record recording status :: " + STRecorder.this.isRecording;
                    MyLog.e(str6, str2);
                    if (STRecorder.this.recorder != null) {
                        STRecorder.this.recorder.stop();
                    }
                    MyLog.e(STRecorder.TAG, "record is stoped");
                    if (!STRecorder.this.mIsRecordPaused) {
                        if (randomAccessFileFopen != null) {
                            STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                        }
                        if (randomAccessFileFopen2 != null) {
                            STRecorder.this.fclose(randomAccessFileFopen2, AudioType.MP3);
                        }
                    }
                    if (STRecorder.this.bMute) {
                        DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                    }
                    if (STRecorder.this.recorder != null) {
                    }
                } catch (Exception e15) {
                    e = e15;
                    randomAccessFile = null;
                } catch (Throwable th7) {
                    th2 = th7;
                    randomAccessFile = null;
                    STRecorder.this.isRecording = false;
                    MyLog.e(STRecorder.TAG, str2 + STRecorder.this.isRecording);
                    if (STRecorder.this.recorder != null) {
                        STRecorder.this.recorder.stop();
                    }
                    MyLog.e(STRecorder.TAG, str);
                    if (!STRecorder.this.mIsRecordPaused) {
                        if (randomAccessFileFopen != null) {
                            STRecorder.this.fclose(randomAccessFileFopen, AudioType.WAV);
                        }
                        if (randomAccessFile != null) {
                            STRecorder.this.fclose(randomAccessFile, AudioType.MP3);
                        }
                    }
                    if (STRecorder.this.bMute) {
                        DeviceUtils.muteAudioFocus(STRecorder.this.getContext(), false);
                    }
                    if (STRecorder.this.recorder != null) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Exception e16) {
                e = e16;
                randomAccessFileFopen = null;
            } catch (Throwable th8) {
                th2 = th8;
                randomAccessFileFopen = null;
            }
        }

        public void cancel() {
            this.mIsCancelled = true;
            Future<?> future = this.mFuture;
            if (future != null) {
                future.cancel(true);
            }
        }

        public boolean isCancelled() {
            if (this.mIsCancelled) {
                return true;
            }
            Future<?> future = this.mFuture;
            return future != null && future.isCancelled();
        }

        public void start() {
            this.mFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.stkouyu.STRecorder.RecordTask.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    RecordTask.this.doRecordTask();
                }
            });
        }

        private RecordTask() {
            this.mIsCancelled = false;
        }
    }

    private STRecorder(Context context, String str, Integer num, Integer num2) {
        this.mAudioType = AudioType.WAV;
        this.mAudioSource = 1;
        MyLog.e(TAG, "===>ST STRecorder init");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        if (num2 != null) {
            this.mAudioSource = num2.intValue();
        }
        this.chunkSize = num;
        try {
            if (MyUtil.isNotNull(str)) {
                this.mAudioType = str;
            }
            if (AudioType.WAV.equals(this.mAudioType)) {
                initAudioRecorderWav();
                initAudioPlayerWav();
            } else {
                initAudioRecorderLame();
                initAudioPlayerLame();
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        } catch (Throwable th2) {
            MyLog.e(TAG, "===>ST Exception");
            th2.printStackTrace();
        }
    }

    private void destoryPlaybackTimer() {
        CountDownTimer countDownTimer = this.mPlaybackTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mPlaybackTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    public void fclose(RandomAccessFile randomAccessFile, String str) throws IOException {
        try {
            if (AudioType.WAV.equals(str)) {
                try {
                    try {
                        randomAccessFile.seek(4L);
                        randomAccessFile.writeInt(Integer.reverseBytes((int) (randomAccessFile.length() - 8)));
                        randomAccessFile.seek(40L);
                        randomAccessFile.writeInt(Integer.reverseBytes((int) (randomAccessFile.length() - 44)));
                    } catch (Exception e8) {
                        MyLog.e(TAG, "===>ST Exception");
                        e8.printStackTrace();
                    }
                    return;
                } finally {
                    randomAccessFile.close();
                }
            }
            try {
                byte[] bArr = new byte[this.bufferSize];
                int iFlush = SimpleLame.flush(bArr);
                if (iFlush > 0) {
                    randomAccessFile.write(bArr, 0, iFlush);
                }
                randomAccessFile.close();
                SimpleLame.tags(this.mp3Path);
                releaseLame();
            } catch (Exception e10) {
                MyLog.e(TAG, "===>ST Exception");
                e10.printStackTrace();
                randomAccessFile.close();
                randomAccessFile = this.mp3Path;
                SimpleLame.tags(randomAccessFile);
                releaseLame();
            } catch (Throwable th2) {
                MyLog.e(TAG, "===>ST Exception");
                th2.printStackTrace();
                randomAccessFile.close();
                randomAccessFile = this.mp3Path;
                SimpleLame.tags(randomAccessFile);
                releaseLame();
            }
        } catch (Throwable th3) {
            randomAccessFile.close();
            SimpleLame.tags(this.mp3Path);
            releaseLame();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RandomAccessFile fopen(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        if (AudioType.WAV.equals(str2)) {
            randomAccessFile.writeBytes("RIFF");
            randomAccessFile.writeInt(0);
            randomAccessFile.writeBytes("WAVE");
            randomAccessFile.writeBytes("fmt ");
            randomAccessFile.writeInt(Integer.reverseBytes(16));
            randomAccessFile.writeShort(Short.reverseBytes((short) 1));
            randomAccessFile.writeShort(Short.reverseBytes((short) CHANNELS));
            randomAccessFile.writeInt(Integer.reverseBytes(FREQUENCY));
            randomAccessFile.writeInt(Integer.reverseBytes(((CHANNELS * FREQUENCY) * BITS) / 8));
            randomAccessFile.writeShort(Short.reverseBytes((short) ((CHANNELS * BITS) / 8)));
            randomAccessFile.writeShort(Short.reverseBytes((short) (CHANNELS * BITS)));
            randomAccessFile.writeBytes("data");
            randomAccessFile.writeInt(0);
        }
        if (AudioType.MP3.equals(str2)) {
            releaseLame();
            initLame();
        }
        return randomAccessFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fwrite(RandomAccessFile randomAccessFile, byte[] bArr, int i11, int i12) {
        try {
            randomAccessFile.write(bArr, i11, i12);
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext() {
        return this.mContext;
    }

    public static STRecorder getInstance() {
        return getInstance(null);
    }

    public static boolean getRecorderOccupied(Context context) {
        return getRecorderOccupied(context, 1);
    }

    public static ExecutorService getThreadPoolExecutor() {
        if (fixedThreadPoolInstance == null) {
            synchronized (STRecorder.class) {
                try {
                    if (fixedThreadPoolInstance == null) {
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        if (iAvailableProcessors < 2) {
                            iAvailableProcessors = 2;
                        }
                        threadsize = iAvailableProcessors;
                        fixedThreadPoolInstance = Executors.newFixedThreadPool(iAvailableProcessors);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fixedThreadPoolInstance;
    }

    private void initAudioPlayerLame() {
        try {
            if (this.mMediaPlayer == null) {
                this.mMediaPlayer = new MediaPlayer();
            }
        } catch (Exception unused) {
            this.mMediaPlayer = null;
        }
    }

    private void initAudioPlayerWav() {
        try {
            int i11 = CHANNELS;
            int i12 = FREQUENCY;
            int iIntValue = ((((i11 * i12) * BITS) * INTERVAL) / 1000) / 8;
            int minBufferSize = AudioRecord.getMinBufferSize(i12, 16, 2);
            if (minBufferSize > iIntValue) {
                iIntValue = minBufferSize;
            }
            Integer num = this.chunkSize;
            if (num != null && num.intValue() >= this.minChunkSize) {
                iIntValue = this.chunkSize.intValue();
            }
            int i13 = iIntValue;
            this.bufferSize = i13;
            if (this.player == null) {
                AudioTrack audioTrack = new AudioTrack(3, FREQUENCY, 4, 2, i13, 1);
                this.player = audioTrack;
                if (audioTrack.getState() != 1) {
                    this.player = null;
                }
            }
        } catch (Exception unused) {
            this.player = null;
        }
    }

    private void initAudioRecorderLame() {
        int minBufferSize = AudioRecord.getMinBufferSize(FREQUENCY, 16, 2) / 2;
        if (minBufferSize <= 0) {
            MyLog.e(TAG, "mp3 buffer size:" + String.valueOf(minBufferSize) + ", is invalid, Sample rate is not supported");
        }
        int i11 = minBufferSize % 160;
        if (i11 != 0) {
            minBufferSize += 160 - i11;
            MyLog.d(TAG, "Frame size: " + minBufferSize);
        }
        int iIntValue = minBufferSize * 2;
        Integer num = this.chunkSize;
        if (num != null && num.intValue() >= this.minChunkSize) {
            iIntValue = this.chunkSize.intValue();
        }
        int i12 = iIntValue;
        MyLog.e(TAG, "mp3 bufferSize:" + i12);
        this.recorder = new AudioRecord(this.mAudioSource, FREQUENCY, 16, 2, i12);
        this.bufferSize = i12;
    }

    private void initAudioRecorderWav() {
        try {
            int i11 = CHANNELS;
            int i12 = FREQUENCY;
            int iIntValue = ((((i11 * i12) * BITS) * INTERVAL) / 1000) / 8;
            int minBufferSize = AudioRecord.getMinBufferSize(i12, 16, 2);
            if (minBufferSize <= 0) {
                MyLog.e(TAG, "wav buffer size" + String.valueOf(minBufferSize) + ", is invalid, Sample rate is not supported");
            }
            if (minBufferSize > iIntValue) {
                iIntValue = minBufferSize;
            }
            Integer num = this.chunkSize;
            if (num != null && num.intValue() >= this.minChunkSize) {
                iIntValue = this.chunkSize.intValue();
            }
            int i13 = iIntValue;
            MyLog.e(TAG, "wav bufferSize:" + i13);
            this.recorder = new AudioRecord(this.mAudioSource, FREQUENCY, 16, 2, i13);
        } catch (Exception unused) {
            this.recorder = null;
        }
    }

    private void initLame() {
        if (this.lameInited) {
            return;
        }
        try {
            MyLog.e(TAG, "init lame");
            this.lameInited = true;
            int i11 = FREQUENCY;
            SimpleLame.init(i11, CHANNELS, i11, 128, 3);
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        } catch (Throwable th2) {
            MyLog.e(TAG, "===>ST Exception");
            th2.printStackTrace();
        }
    }

    private void releaseLame() {
        try {
            if (this.lameInited) {
                this.lameInited = false;
                SimpleLame.close();
            }
        } catch (Exception e8) {
            this.lameInited = false;
            e8.printStackTrace();
        }
    }

    private void startPlaybackTimer(final int i11, final int i12) {
        destoryPlaybackTimer();
        this.mHandler.post(new Runnable() { // from class: com.stkouyu.STRecorder.3
            @Override // java.lang.Runnable
            public void run() {
                STRecorder.this.mPlaybackTimer = new CountDownTimer(i11, i12) { // from class: com.stkouyu.STRecorder.3.1
                    @Override // com.stkouyu.util.CountDownTimer
                    public void onFinish(long j11) {
                        try {
                            Message message = new Message();
                            message.what = 19;
                            Bundle bundle = new Bundle();
                            bundle.putLong("millisUntilFinished", STRecorder.this.playBackDuration);
                            bundle.putDouble("percentUntilFinished", 100.0d);
                            message.setData(bundle);
                            STRecorder.this.mHandler.sendMessage(message);
                        } catch (Exception e8) {
                            MyLog.e(STRecorder.TAG, "===>ST Exception");
                            e8.printStackTrace();
                        }
                    }

                    @Override // com.stkouyu.util.CountDownTimer
                    public void onTick(long j11) {
                        Message message = new Message();
                        try {
                            message.what = 19;
                            Bundle bundle = new Bundle();
                            bundle.putLong("playbackDuration", j11);
                            bundle.putDouble("playbackPercent", (j11 * 100.0d) / ((double) i11));
                            message.setData(bundle);
                            STRecorder.this.mHandler.sendMessage(message);
                        } catch (Exception e8) {
                            MyLog.e(STRecorder.TAG, "===>ST Exception");
                            e8.printStackTrace();
                        }
                    }
                };
                STRecorder.this.mPlaybackTimer.start();
            }
        });
    }

    public static int threaddog() {
        if (fixedThreadPoolInstance == null) {
            return 0;
        }
        return threadsize - ((ThreadPoolExecutor) fixedThreadPoolInstance).getActiveCount();
    }

    public boolean activeRecorder() {
        try {
            if (AudioType.WAV.equals(this.mAudioType)) {
                initAudioRecorderWav();
                return true;
            }
            initAudioRecorderLame();
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public void cancel() {
        this.isRecordCancel = true;
        stop();
    }

    public void delete() {
        MyLog.e(TAG, "release start");
        stopPlay();
        releaseRecorder();
        releasePlayer();
        releaseLame();
        PlayBackTask playBackTask = this.mPlayBackTask;
        if (playBackTask != null) {
            playBackTask.cancel(true);
            this.mPlayBackTask = null;
        }
        RecordTask recordTask = this.mRecordTask;
        if (recordTask != null) {
            recordTask.cancel();
            this.mRecordTask = null;
        }
        instance = null;
        MyLog.e(TAG, "released");
    }

    public void pause() {
        RecordTask recordTask;
        try {
            if (!this.isRecording && (recordTask = this.mRecordTask) != null) {
                recordTask.cancel();
                this.mRecordTask = null;
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        }
        this.isRecording = false;
        this.mIsRecordPaused = true;
        try {
            AudioRecord audioRecord = this.recorder;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception e10) {
            MyLog.e(TAG, "===>ST Exception");
            e10.printStackTrace();
        }
    }

    public Void playBackFile(String str) {
        Handler handler;
        int i11;
        try {
            try {
                try {
                    if (MyUtil.isNotNull(str)) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                        Handler handler2 = this.mHandler;
                        if (handler2 != null) {
                            handler2.sendEmptyMessage(15);
                        }
                        int length = (int) (randomAccessFile.length() / 2);
                        this.totalFrames = length;
                        this.playBackDuration = (((long) length) * 1000) / ((long) FREQUENCY);
                        this.isPlaying = true;
                        if (AudioType.WAV.equals(this.mAudioType)) {
                            try {
                                try {
                                    randomAccessFile.seek(44L);
                                    this.player.play();
                                    startPlaybackTimer((int) this.playBackDuration, 100);
                                    MyLog.e(TAG, "start playback");
                                    int i12 = this.bufferSize;
                                    byte[] bArr = new byte[i12];
                                    int length2 = (int) ((randomAccessFile.length() - 44) / 2);
                                    this.totalFrames = length2;
                                    this.playBackDuration = (((long) length2) * 1000) / ((long) FREQUENCY);
                                    this.isPlaying = true;
                                    while (this.isPlaying && (i11 = randomAccessFile.read(bArr, 0, i12)) != -1) {
                                        this.player.write(bArr, 0, i11);
                                    }
                                    this.player.flush();
                                    this.player.stop();
                                    handler = this.mHandler;
                                    if (handler != null) {
                                        handler.sendEmptyMessage(8);
                                    }
                                } catch (Throwable th2) {
                                    Handler handler3 = this.mHandler;
                                    if (handler3 != null) {
                                        handler3.sendEmptyMessage(8);
                                    }
                                    throw th2;
                                }
                            } catch (Exception e8) {
                                MyLog.e(TAG, "===>ST Exception");
                                e8.printStackTrace();
                                AudioTrack audioTrack = this.player;
                                if (audioTrack != null && audioTrack.getPlayState() == 3) {
                                    this.player.stop();
                                }
                                handler = this.mHandler;
                                if (handler != null) {
                                }
                                this.isPlaying = false;
                            }
                        } else {
                            try {
                                this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.stkouyu.STRecorder.1
                                    @Override // android.media.MediaPlayer.OnCompletionListener
                                    public void onCompletion(MediaPlayer mediaPlayer) {
                                        STRecorder.this.isPlaying = false;
                                        if (STRecorder.this.mHandler != null) {
                                            STRecorder.this.mHandler.sendEmptyMessage(8);
                                        }
                                    }
                                });
                                this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.stkouyu.STRecorder.2
                                    @Override // android.media.MediaPlayer.OnErrorListener
                                    public boolean onError(MediaPlayer mediaPlayer, int i13, int i14) {
                                        STRecorder.this.isPlaying = false;
                                        return false;
                                    }
                                });
                                MyLog.e(TAG, "===>media player status1:" + this.mMediaPlayer.isPlaying());
                                this.mMediaPlayer.reset();
                                this.mMediaPlayer.setDataSource(str);
                                this.mMediaPlayer.prepare();
                                this.mMediaPlayer.start();
                                startPlaybackTimer((int) this.playBackDuration, 100);
                                MyLog.e(TAG, "===>media player status2:" + this.mMediaPlayer.isPlaying());
                            } catch (Exception e10) {
                                MyLog.e(TAG, "===>ST Exception");
                                e10.printStackTrace();
                                Handler handler4 = this.mHandler;
                                if (handler4 != null) {
                                    handler4.sendEmptyMessage(8);
                                }
                            }
                        }
                        this.isPlaying = false;
                    }
                } catch (Throwable th3) {
                    MyLog.e(TAG, "===>ST Exception");
                    th3.printStackTrace();
                    Message message = new Message();
                    message.what = 16;
                    message.obj = th3.getMessage();
                    this.mHandler.sendMessage(message);
                }
            } catch (Exception e11) {
                MyLog.e(TAG, "===>ST Exception");
                e11.printStackTrace();
                Message message2 = new Message();
                message2.what = 16;
                message2.obj = e11.getMessage();
                this.mHandler.sendMessage(message2);
            }
            this.isPlaying = false;
            return null;
        } catch (Throwable th4) {
            this.isPlaying = false;
            throw th4;
        }
    }

    public void playWithPath(String str, Handler handler) {
        MyLog.e(TAG, "start playWithPath");
        try {
            if (AudioType.WAV.equals(this.mAudioType)) {
                initAudioPlayerWav();
            } else {
                initAudioPlayerLame();
            }
            stopPlay();
            if (handler != null) {
                this.mHandler = handler;
                if (MyUtil.isNull(str)) {
                    Message message = new Message();
                    message.what = 16;
                    message.obj = "param is nil";
                    this.mHandler.sendMessage(message);
                    return;
                }
            }
            this.isPlaying = false;
            PlayBackTask playBackTask = this.mPlayBackTask;
            if (playBackTask != null) {
                playBackTask.cancel(true);
            }
            PlayBackTask playBackTask2 = new PlayBackTask();
            this.mPlayBackTask = playBackTask2;
            playBackTask2.executeOnExecutor(getThreadPoolExecutor(), str);
        } catch (Exception e8) {
            MyLog.e(TAG, "===>playWithPath error");
            e8.printStackTrace();
        }
    }

    public void playback(Handler handler) {
        playWithPath(this.path, handler);
    }

    public void releasePlayer() {
        AudioTrack audioTrack = this.player;
        if (audioTrack != null) {
            audioTrack.release();
            this.player = null;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mMediaPlayer = null;
        }
    }

    public boolean releaseRecorder() {
        try {
            AudioRecord audioRecord = this.recorder;
            if (audioRecord == null) {
                return true;
            }
            audioRecord.release();
            this.recorder = null;
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public void restart() {
        this.mIsRecordPaused = false;
        this.mIsReStartRecord = true;
        RecordTask recordTask = this.mRecordTask;
        if (recordTask != null) {
            recordTask.cancel();
            this.mRecordTask = null;
        }
        this.mRecordTask = new RecordTask();
        MyLog.e(TAG, "restart record");
        RecordTask recordTask2 = this.mRecordTask;
        if (recordTask2 != null) {
            recordTask2.start();
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setMp3Path(String str) {
        this.mp3Path = str;
    }

    public void setOnSTRecorderListener(OnSTRecorderListener onSTRecorderListener) {
        this.mOnSTRecorderListener = onSTRecorderListener;
    }

    public void setbMute(boolean z11) {
        this.bMute = z11;
    }

    public void start(String str, Callback callback) {
        this.path = str;
        this.mCallback = callback;
        RecordTask recordTask = this.mRecordTask;
        if (recordTask != null) {
            recordTask.cancel();
            this.mRecordTask = null;
        }
        this.mRecordTask = new RecordTask();
        this.isPlaying = false;
        this.mIsRecordPaused = false;
        if (this.mPlayBackTask != null) {
            MyLog.e(TAG, "STRecorder.this.mMediaPlayer stopPlay");
            stopPlay();
            this.mPlayBackTask.cancel(true);
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        AudioRecord audioRecord = this.recorder;
        if (audioRecord == null || audioRecord.getState() == 0 || (android.os.Build.VERSION.SDK_INT >= 28 && (!android.os.Build.BRAND.toLowerCase().equals("onyx") || !android.os.Build.PRODUCT.toLowerCase().equals("notex5")))) {
            if (AudioType.MP3.equals(this.mAudioType)) {
                initAudioRecorderLame();
            } else {
                initAudioRecorderWav();
            }
        }
        this.isRecordCancel = false;
        MyLog.e(TAG, "start record, audioType:" + this.mAudioType);
        RecordTask recordTask2 = this.mRecordTask;
        if (recordTask2 != null) {
            recordTask2.start();
        }
    }

    public void stop() {
        try {
            if (!this.isRecording && this.mRecordTask != null) {
                MyLog.e(TAG, "maybe stop before recording start");
                this.mRecordTask.cancel();
                this.mRecordTask = null;
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        }
        this.mIsReStartRecord = false;
        this.isRecording = false;
        try {
            AudioRecord audioRecord = this.recorder;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception e10) {
            MyLog.e(TAG, "===>ST Exception");
            e10.printStackTrace();
        }
    }

    public void stopPlay() {
        MyLog.e(TAG, "stop playback");
        this.isPlaying = false;
        try {
            destoryPlaybackTimer();
            PlayBackTask playBackTask = this.mPlayBackTask;
            if (playBackTask != null) {
                playBackTask.cancel(true);
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.mMediaPlayer.setOnCompletionListener(null);
                    this.mMediaPlayer.stop();
                    this.mHandler.sendEmptyMessage(8);
                }
                AudioTrack audioTrack = this.player;
                if (audioTrack == null || audioTrack.getState() != 1) {
                    return;
                }
                this.player.stop();
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>Stop Playback error");
            e8.printStackTrace();
        }
    }

    public static STRecorder getInstance(Context context) {
        return getInstance(context, null);
    }

    public static boolean getRecorderOccupied(Context context, Integer num) throws Throwable {
        Throwable th2;
        Exception exc;
        boolean z11 = false;
        if (context == null) {
            return false;
        }
        int i11 = CHANNELS;
        int i12 = FREQUENCY;
        int i13 = ((((i11 * i12) * BITS) * INTERVAL) / 1000) / 8;
        int minBufferSize = AudioRecord.getMinBufferSize(i12, 16, 2);
        if (minBufferSize <= 0) {
            MyLog.e(TAG, "getRecorderOccupied wav buffer size is invalid, Sample rate is not supported: " + minBufferSize);
            return true;
        }
        int i14 = minBufferSize > i13 ? minBufferSize : i13;
        AudioRecord audioRecord = null;
        try {
            try {
                AudioRecord audioRecord2 = new AudioRecord(num.intValue(), FREQUENCY, 16, 2, i14);
                try {
                    if (audioRecord2.getState() != 1) {
                        MyLog.e(TAG, "AudioRecord is not INITIALIZED");
                        try {
                            audioRecord2.stop();
                        } catch (IllegalStateException e8) {
                            MyLog.e(TAG, "Error stopping AudioRecord: " + e8.getMessage());
                        }
                        audioRecord2.release();
                        return true;
                    }
                    try {
                        audioRecord2.startRecording();
                        if (audioRecord2.read(new short[i14], 0, i14) <= 0) {
                            MyLog.e(TAG, "Unable to read audio data");
                            try {
                                audioRecord2.stop();
                            } catch (IllegalStateException e10) {
                                MyLog.e(TAG, "Error stopping AudioRecord: " + e10.getMessage());
                            }
                            audioRecord2.release();
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                        if (audioManager != null) {
                            int mode = audioManager.getMode();
                            MyLog.d(TAG, "AudioRecord mode is: " + mode);
                            if (mode != 0) {
                                z11 = true;
                            }
                        }
                        try {
                            audioRecord2.stop();
                        } catch (IllegalStateException e11) {
                            MyLog.e(TAG, "Error stopping AudioRecord: " + e11.getMessage());
                        }
                        audioRecord2.release();
                        return z11;
                    } catch (IllegalStateException e12) {
                        MyLog.e(TAG, "Cannot start recording: " + e12.getMessage());
                        e12.printStackTrace();
                        try {
                            audioRecord2.stop();
                        } catch (IllegalStateException e13) {
                            MyLog.e(TAG, "Error stopping AudioRecord: " + e13.getMessage());
                        }
                        audioRecord2.release();
                        return true;
                    }
                } catch (Exception e14) {
                    exc = e14;
                    audioRecord = audioRecord2;
                    MyLog.e(TAG, "Error during AudioRecord check: " + exc.getMessage());
                    exc.printStackTrace();
                    if (audioRecord == null) {
                        return true;
                    }
                    try {
                        audioRecord.stop();
                    } catch (IllegalStateException e15) {
                        MyLog.e(TAG, "Error stopping AudioRecord: " + e15.getMessage());
                    }
                    audioRecord.release();
                    return true;
                } catch (Throwable th3) {
                    th2 = th3;
                    audioRecord = audioRecord2;
                    if (audioRecord == null) {
                        throw th2;
                    }
                    try {
                        audioRecord.stop();
                    } catch (IllegalStateException e16) {
                        MyLog.e(TAG, "Error stopping AudioRecord: " + e16.getMessage());
                    }
                    audioRecord.release();
                    throw th2;
                }
            } catch (Exception e17) {
                exc = e17;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static STRecorder getInstance(Context context, String str) {
        return getInstance(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fwrite(RandomAccessFile randomAccessFile, int i11, byte[] bArr) {
        try {
            short[] sArr = new short[i11 / 2];
            byte[] bArr2 = new byte[(int) ((((double) bArr.length) * 1.25d) + 7200.0d)];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            int iEncode = SimpleLame.encode(sArr, sArr, i11 / 2, bArr2);
            if (iEncode > 0) {
                randomAccessFile.write(bArr2, 0, iEncode);
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        } catch (Throwable th2) {
            MyLog.e(TAG, "===>ST Exception");
            th2.printStackTrace();
        }
    }

    public static STRecorder getInstance(Context context, String str, Integer num) {
        if (instance == null || (MyUtil.isNotNull(str) && !str.equals(instance.mAudioType))) {
            instance = new STRecorder(context, str, num, null);
        }
        return instance;
    }

    public static STRecorder getInstance(Context context, String str, Integer num, Integer num2) {
        if (instance == null || ((MyUtil.isNotNull(str) && !str.equals(instance.mAudioType)) || (num2 != null && num2.intValue() != instance.mAudioSource))) {
            instance = new STRecorder(context, str, num, num2);
        }
        return instance;
    }

    public void finalize() {
    }
}
