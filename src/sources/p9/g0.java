package p9;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f46663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f46664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f46665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46667e;

    public g0(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f46665c = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.lingodeer.R.id.icon_frame, view.findViewById(com.lingodeer.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f46663a = view.getBackground();
        if (textView != null) {
            this.f46664b = textView.getTextColors();
        }
    }

    public final View a(int i11) {
        SparseArray sparseArray = this.f46665c;
        View view = (View) sparseArray.get(i11);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i11);
        if (viewFindViewById != null) {
            sparseArray.put(i11, viewFindViewById);
        }
        return viewFindViewById;
    }
}
