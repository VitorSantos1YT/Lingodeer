package r;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        z4.e iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                iVar = new f3.i(clipData, 3);
            } else {
                z4.f fVar = new z4.f();
                fVar.f58828b = clipData;
                fVar.f58829c = 3;
                iVar = fVar;
            }
            z4.s0.m(textView, iVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        z4.e iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new f3.i(clipData, 3);
        } else {
            z4.f fVar = new z4.f();
            fVar.f58828b = clipData;
            fVar.f58829c = 3;
            iVar = fVar;
        }
        z4.s0.m(view, iVar.build());
        return true;
    }
}
