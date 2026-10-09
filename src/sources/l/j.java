package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f39020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39021b;

    public j(Context context) {
        this(context, k.e(context, 0));
    }

    public j a(Drawable drawable) {
        this.f39020a.f38962c = drawable;
        return this;
    }

    public j b(CharSequence charSequence) {
        this.f39020a.f38965f = charSequence;
        return this;
    }

    public j c(CharSequence charSequence, p9.t tVar) {
        f fVar = this.f39020a;
        fVar.f38968i = charSequence;
        fVar.f38969j = tVar;
        return this;
    }

    public k create() {
        ListAdapter cVar;
        f fVar = this.f39020a;
        ContextThemeWrapper contextThemeWrapper = fVar.f38960a;
        ContextThemeWrapper contextThemeWrapper2 = fVar.f38960a;
        k kVar = new k(contextThemeWrapper, this.f39021b);
        View view = fVar.f38964e;
        i iVar = kVar.f39024f;
        if (view != null) {
            iVar.f39012w = view;
        } else {
            CharSequence charSequence = fVar.f38963d;
            if (charSequence != null) {
                iVar.f38994d = charSequence;
                TextView textView = iVar.f39010u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = fVar.f38962c;
            if (drawable != null) {
                iVar.f39008s = drawable;
                ImageView imageView = iVar.f39009t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    iVar.f39009t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = fVar.f38965f;
        if (charSequence2 != null) {
            iVar.f38995e = charSequence2;
            TextView textView2 = iVar.f39011v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = fVar.f38966g;
        if (charSequence3 != null) {
            iVar.c(-1, charSequence3, fVar.f38967h);
        }
        CharSequence charSequence4 = fVar.f38968i;
        if (charSequence4 != null) {
            iVar.c(-2, charSequence4, fVar.f38969j);
        }
        if (fVar.m != null || fVar.f38972n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) fVar.f38961b.inflate(iVar.A, (ViewGroup) null);
            if (fVar.f38976r) {
                cVar = new c(fVar, contextThemeWrapper2, iVar.B, fVar.m, alertController$RecycleListView);
            } else {
                int i11 = fVar.f38977s ? iVar.C : iVar.D;
                ListAdapter hVar = fVar.f38972n;
                if (hVar == null) {
                    hVar = new h(contextThemeWrapper2, i11, R.id.text1, fVar.m);
                }
                cVar = hVar;
            }
            iVar.f39013x = cVar;
            iVar.f39014y = fVar.f38978t;
            if (fVar.f38973o != null) {
                alertController$RecycleListView.setOnItemClickListener(new d(fVar, iVar));
            } else if (fVar.f38979u != null) {
                alertController$RecycleListView.setOnItemClickListener(new e(fVar, alertController$RecycleListView, iVar));
            }
            if (fVar.f38977s) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (fVar.f38976r) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            iVar.f38996f = alertController$RecycleListView;
        }
        View view2 = fVar.f38974p;
        if (view2 != null) {
            iVar.f38997g = view2;
            iVar.f38998h = false;
        }
        kVar.setCancelable(fVar.f38970k);
        if (fVar.f38970k) {
            kVar.setCanceledOnTouchOutside(true);
        }
        kVar.setOnCancelListener(null);
        kVar.setOnDismissListener(null);
        q.m mVar = fVar.f38971l;
        if (mVar != null) {
            kVar.setOnKeyListener(mVar);
        }
        return kVar;
    }

    public j d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        f fVar = this.f39020a;
        fVar.f38966g = charSequence;
        fVar.f38967h = onClickListener;
        return this;
    }

    public Context getContext() {
        return this.f39020a.f38960a;
    }

    public j setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
        f fVar = this.f39020a;
        fVar.f38968i = fVar.f38960a.getText(i11);
        fVar.f38969j = onClickListener;
        return this;
    }

    public j setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
        f fVar = this.f39020a;
        fVar.f38966g = fVar.f38960a.getText(i11);
        fVar.f38967h = onClickListener;
        return this;
    }

    public j setTitle(CharSequence charSequence) {
        this.f39020a.f38963d = charSequence;
        return this;
    }

    public j setView(View view) {
        this.f39020a.f38974p = view;
        return this;
    }

    public j(Context context, int i11) {
        this.f39020a = new f(new ContextThemeWrapper(context, k.e(context, i11)));
        this.f39021b = i11;
    }
}
