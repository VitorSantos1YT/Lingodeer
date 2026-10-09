package p;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i11) {
        callback.onProvideKeyboardShortcuts(list, menu, i11);
    }
}
