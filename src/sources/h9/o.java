package h9;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f32082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f32083b;

    public o(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f32082a = (TextView) view.findViewById(R.id.exo_text);
        this.f32083b = view.findViewById(R.id.exo_check);
    }
}
