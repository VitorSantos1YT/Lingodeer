package com.stkouyu.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class HandlerUtils {
    private Handler mHandler;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface HandlerDispose {
        void handleMessage(Message message);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Holder {
        public static HandlerUtils instance = new HandlerUtils();

        private Holder() {
        }
    }

    public static HandlerUtils getInstance() {
        return Holder.instance;
    }

    public void UIOnFinish() {
        this.mHandler = null;
    }

    public Handler getNewChildHandler() {
        MyLog.e("17kouyu", "getNewChildHandler===>");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            Looper.prepare();
            this.mHandler = new Handler(Looper.myLooper());
            Looper.loop();
        } else {
            this.mHandler = new Handler(looperMyLooper);
        }
        return this.mHandler;
    }

    public Handler getNewChildHandlerCB(final HandlerDispose handlerDispose) {
        MyLog.e("17kouyu", "getNewChildHandlerCB===>");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            Looper.prepare();
            this.mHandler = new Handler() { // from class: com.stkouyu.util.HandlerUtils.3
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    handlerDispose.handleMessage(message);
                }
            };
            Looper.loop();
        } else {
            this.mHandler = new Handler(looperMyLooper) { // from class: com.stkouyu.util.HandlerUtils.4
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    handlerDispose.handleMessage(message);
                }
            };
        }
        return this.mHandler;
    }

    public Handler getNewHandler() {
        MyLog.e("17kouyu", "getNewHandler===>");
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        if (looperMyLooper == null) {
            this.mHandler = new Handler(mainLooper);
        } else {
            this.mHandler = new Handler(looperMyLooper);
        }
        return this.mHandler;
    }

    public Handler getNewHandlerCB(final HandlerDispose handlerDispose) {
        MyLog.e("17kouyu", "getNewHandlerCB===>");
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        if (looperMyLooper == null) {
            this.mHandler = new Handler(mainLooper) { // from class: com.stkouyu.util.HandlerUtils.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    handlerDispose.handleMessage(message);
                }
            };
        } else {
            this.mHandler = new Handler(looperMyLooper) { // from class: com.stkouyu.util.HandlerUtils.2
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    handlerDispose.handleMessage(message);
                }
            };
        }
        return this.mHandler;
    }

    public Handler getUIHandler() {
        MyLog.e("17kouyu", "getUIHandler===>");
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper() == Looper.getMainLooper()) {
            return this.mHandler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mHandler = handler2;
        return handler2;
    }

    public Handler getUIHandlerCB(final HandlerDispose handlerDispose) {
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper() == Looper.getMainLooper()) {
            return this.mHandler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper()) { // from class: com.stkouyu.util.HandlerUtils.5
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                handlerDispose.handleMessage(message);
            }
        };
        this.mHandler = handler2;
        return handler2;
    }

    private HandlerUtils() {
    }
}
