package tf;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.p0;
import bw.ORXQ.ADSb;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.lingodeer.R;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.j1;
import org.json.JSONObject;
import qp.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class k extends androidx.fragment.app.y {
    public View S;
    public TextView T;
    public TextView U;
    public l V;
    public final AtomicBoolean W = new AtomicBoolean();
    public volatile re.z X;
    public volatile ScheduledFuture Y;
    public volatile i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f52191a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f52192b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public t f52193c0;

    public final void B() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        i iVar = this.Z;
        Long lValueOf = iVar != null ? Long.valueOf(iVar.f52184d) : null;
        if (lValueOf != null) {
            synchronized (l.f52194d) {
                try {
                    if (l.f52195e == null) {
                        l.f52195e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = l.f52195e;
                    if (scheduledThreadPoolExecutor == null) {
                        kotlin.jvm.internal.m.n("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.Y = scheduledThreadPoolExecutor.schedule(new lf.i0(this, 11), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    public final void C(i iVar) {
        Bitmap bitmapCreateBitmap;
        boolean zC;
        this.Z = iVar;
        TextView textView = this.T;
        if (textView == null) {
            kotlin.jvm.internal.m.n("confirmationCode");
            throw null;
        }
        textView.setText(iVar.f52182b);
        String str = iVar.f52181a;
        kf.b bVar = kf.b.f38144a;
        boolean z11 = false;
        if (qf.a.b(kf.b.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(EncodeHintType.class);
                enumMap.put(EncodeHintType.MARGIN, 2);
                try {
                    BitMatrix bitMatrixA = new MultiFormatWriter().a(str, BarcodeFormat.QR_CODE, enumMap);
                    int i11 = bitMatrixA.f21481b;
                    int i12 = bitMatrixA.f21480a;
                    int[] iArr = new int[i11 * i12];
                    for (int i13 = 0; i13 < i11; i13++) {
                        int i14 = i13 * i12;
                        for (int i15 = 0; i15 < i12; i15++) {
                            iArr[i14 + i15] = bitMatrixA.a(i15, i13) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i12, 0, 0, i12, i11);
                    } catch (WriterException unused) {
                    }
                } catch (WriterException unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th2) {
                qf.a.a(kf.b.class, th2);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        TextView textView2 = this.U;
        if (textView2 == null) {
            kotlin.jvm.internal.m.n("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.T;
        if (textView3 == null) {
            kotlin.jvm.internal.m.n("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.S;
        if (view == null) {
            kotlin.jvm.internal.m.n("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f52192b0) {
            String str2 = iVar.f52182b;
            if (qf.a.b(kf.b.class)) {
                zC = false;
            } else {
                try {
                    if (kf.b.b()) {
                        zC = kf.b.f38144a.c(str2);
                    } else {
                        zC = false;
                    }
                } catch (Throwable th3) {
                    qf.a.a(kf.b.class, th3);
                }
            }
            if (zC) {
                se.m mVar = new se.m(getContext(), (String) null);
                re.s sVar = re.s.f49201a;
                if (re.i0.c()) {
                    mVar.g("fb_smart_login_service", null);
                }
            }
        }
        if (iVar.f52185e != 0 && (new Date().getTime() - iVar.f52185e) - (iVar.f52184d * 1000) < 0) {
            z11 = true;
        }
        if (z11) {
            B();
        } else {
            A();
        }
    }

    public final void D(t request) {
        kotlin.jvm.internal.m.f(request, "request");
        this.f52193c0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f52215b));
        j1.G("redirect_uri", request.f52220t, bundle);
        j1.G("target_user_id", request.K, bundle);
        bundle.putString("access_token", re.s.b() + '|' + re.s.c());
        kf.b bVar = kf.b.f38144a;
        String str = null;
        if (!qf.a.b(kf.b.class)) {
            try {
                HashMap map = new HashMap();
                String DEVICE = Build.DEVICE;
                kotlin.jvm.internal.m.e(DEVICE, "DEVICE");
                map.put("device", DEVICE);
                String MODEL = Build.MODEL;
                kotlin.jvm.internal.m.e(MODEL, "MODEL");
                map.put("model", MODEL);
                String string = new JSONObject(map).toString();
                kotlin.jvm.internal.m.e(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
                str = string;
            } catch (Throwable th2) {
                qf.a.a(kf.b.class, th2);
            }
        }
        bundle.putString("device_info", str);
        String str2 = re.y.f49225j;
        new re.y(null, "device/login", bundle, re.c0.POST, new f(this, 1)).d();
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i iVar;
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        x xVar = (x) ((FacebookActivity) p0VarRequireActivity).f7707a;
        this.V = (l) (xVar != null ? xVar.q().g() : null);
        if (bundle != null && (iVar = (i) bundle.getParcelable("request_state")) != null) {
            C(iVar);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        this.f52191a0 = true;
        this.W.set(true);
        super.onDestroyView();
        re.z zVar = this.X;
        if (zVar != null) {
            zVar.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.Y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.f(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f52191a0) {
            return;
        }
        x();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.Z != null) {
            outState.putParcelable("request_state", this.Z);
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        j jVar = new j(this, requireActivity());
        jVar.setContentView(w(kf.b.b() && !this.f52192b0));
        return jVar;
    }

    public final View w(boolean z11) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.m.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(z11 ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        kotlin.jvm.internal.m.e(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        kotlin.jvm.internal.m.e(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.S = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        kotlin.jvm.internal.m.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.T = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        kotlin.jvm.internal.m.d(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new aj.b(this, 22));
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        kotlin.jvm.internal.m.d(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        this.U = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void x() {
        if (this.W.compareAndSet(false, true)) {
            i iVar = this.Z;
            if (iVar != null) {
                kf.b.a(iVar.f52182b);
            }
            l lVar = this.V;
            if (lVar != null) {
                lVar.d().d(new v(lVar.d().f52234t, u.CANCEL, null, "User canceled log in.", null));
            }
            Dialog dialog = this.N;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void y(FacebookException facebookException) {
        if (this.W.compareAndSet(false, true)) {
            i iVar = this.Z;
            if (iVar != null) {
                kf.b.a(iVar.f52182b);
            }
            l lVar = this.V;
            if (lVar != null) {
                t tVar = lVar.d().f52234t;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                lVar.d().d(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.N;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void z(String str, long j11, Long l9) {
        Date date;
        Bundle bundleE = b7.e0.e("fields", "id,permissions,name");
        if (j11 != 0) {
            date = new Date((j11 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        Date date2 = l9.longValue() != 0 ? new Date(l9.longValue() * 1000) : null;
        Date date3 = date;
        re.b bVar = new re.b(str, re.s.b(), "0", null, null, null, null, date3, null, date2, "facebook");
        String str2 = re.y.f49225j;
        re.y yVarB = re.v.B(bVar, "me", new re.c(this, str, date3, date2, 2));
        yVarB.k(re.c0.GET);
        yVarB.f49231d = bundleE;
        yVarB.d();
    }

    public final void A() {
        i iVar = this.Z;
        if (iVar != null) {
            iVar.f52185e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        i iVar2 = this.Z;
        bundle.putString("code", iVar2 != null ? iVar2.f52183c : null);
        bundle.putString(ADSb.sSprCBSZZJNgmpb, re.s.b() + '|' + re.s.c());
        String str = re.y.f49225j;
        this.X = new re.y(null, "device/login_status", bundle, re.c0.POST, new f(this, 0)).d();
    }

    public final void v(String str, m3 m3Var, String str2, Date date, Date date2) {
        l lVar = this.V;
        if (lVar != null) {
            lVar.d().d(new v(lVar.d().f52234t, u.SUCCESS, new re.b(str2, re.s.b(), str, (ArrayList) m3Var.f48058c, (ArrayList) m3Var.f48056a, (ArrayList) m3Var.f48057b, re.g.DEVICE_AUTH, date, null, date2, wuoM.fSEEELfXWXHFjqQ), null, null));
        }
        Dialog dialog = this.N;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
