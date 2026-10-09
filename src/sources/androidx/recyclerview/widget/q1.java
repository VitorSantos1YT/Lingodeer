package androidx.recyclerview.widget;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface q1 {
    boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    void onRequestDisallowInterceptTouchEvent(boolean z11);

    void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
}
