package p9;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Preference f46699a;

    public p(Preference preference) {
        this.f46699a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f46699a;
        CharSequence charSequenceG = preference.g();
        if (!preference.f2328e0 || TextUtils.isEmpty(charSequenceG)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceG);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f46699a;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f2319a.getSystemService("clipboard");
        CharSequence charSequenceG = preference.g();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceG));
        Context context = preference.f2319a;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceG), 0).show();
        return true;
    }
}
