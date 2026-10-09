package r;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f48560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f48561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f48562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f48563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f48564e;

    public f2(View view) {
        this.f48560a = (TextView) view.findViewById(R.id.text1);
        this.f48561b = (TextView) view.findViewById(R.id.text2);
        this.f48562c = (ImageView) view.findViewById(R.id.icon1);
        this.f48563d = (ImageView) view.findViewById(R.id.icon2);
        this.f48564e = (ImageView) view.findViewById(com.lingodeer.R.id.edit_query);
    }
}
