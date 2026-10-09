package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f36007h = {0, 4, 8};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f36008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f36009j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36011b = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f36012c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36013d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f36014e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36015f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f36016g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f36008i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f36009j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static k d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, t.f36031f);
        o(kVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < strArrSplit.length) {
            String strTrim = strArrSplit[i11].trim();
            Object obj = null;
            try {
                iIntValue = s.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.O;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.O.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i12] = iIntValue;
            i11++;
            i12++;
        }
        return i12 != strArrSplit.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public static k g(Context context, AttributeSet attributeSet, boolean z11) {
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? t.f36031f : t.f36027b);
        if (z11) {
            o(kVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i11 = 0;
            while (true) {
                l lVar = kVar.f35929e;
                if (i11 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i11);
                    n nVar = kVar.f35927c;
                    o oVar = kVar.f35930f;
                    m mVar = kVar.f35928d;
                    if (index != 1 && 23 != index && 24 != index) {
                        mVar.f35976a = true;
                        lVar.f35936b = true;
                        nVar.f35988a = true;
                        oVar.f35994a = true;
                    }
                    SparseIntArray sparseIntArray = f36008i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            lVar.f35965q = l(typedArrayObtainStyledAttributes, index, lVar.f35965q);
                            break;
                        case 2:
                            lVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.J);
                            break;
                        case 3:
                            lVar.f35963p = l(typedArrayObtainStyledAttributes, index, lVar.f35963p);
                            break;
                        case 4:
                            lVar.f35961o = l(typedArrayObtainStyledAttributes, index, lVar.f35961o);
                            break;
                        case 5:
                            lVar.f35974z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            lVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.D);
                            break;
                        case 7:
                            lVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.E);
                            break;
                        case 8:
                            lVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.K);
                            break;
                        case 9:
                            lVar.f35971w = l(typedArrayObtainStyledAttributes, index, lVar.f35971w);
                            break;
                        case 10:
                            lVar.f35970v = l(typedArrayObtainStyledAttributes, index, lVar.f35970v);
                            break;
                        case 11:
                            lVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.Q);
                            break;
                        case 12:
                            lVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.R);
                            break;
                        case 13:
                            lVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.N);
                            break;
                        case 14:
                            lVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.P);
                            break;
                        case 15:
                            lVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.S);
                            break;
                        case 16:
                            lVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.O);
                            break;
                        case 17:
                            lVar.f35942e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f35942e);
                            break;
                        case 18:
                            lVar.f35944f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f35944f);
                            break;
                        case 19:
                            lVar.f35946g = typedArrayObtainStyledAttributes.getFloat(index, lVar.f35946g);
                            break;
                        case 20:
                            lVar.f35972x = typedArrayObtainStyledAttributes.getFloat(index, lVar.f35972x);
                            break;
                        case 21:
                            lVar.f35940d = typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f35940d);
                            break;
                        case 22:
                            int i12 = typedArrayObtainStyledAttributes.getInt(index, nVar.f35989b);
                            nVar.f35989b = i12;
                            nVar.f35989b = f36007h[i12];
                            break;
                        case 23:
                            lVar.f35938c = typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f35938c);
                            break;
                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                            lVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.G);
                            break;
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            lVar.f35950i = l(typedArrayObtainStyledAttributes, index, lVar.f35950i);
                            break;
                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                            lVar.f35952j = l(typedArrayObtainStyledAttributes, index, lVar.f35952j);
                            break;
                        case 27:
                            lVar.F = typedArrayObtainStyledAttributes.getInt(index, lVar.F);
                            break;
                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                            lVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.H);
                            break;
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            lVar.f35954k = l(typedArrayObtainStyledAttributes, index, lVar.f35954k);
                            break;
                        case 30:
                            lVar.f35956l = l(typedArrayObtainStyledAttributes, index, lVar.f35956l);
                            break;
                        case 31:
                            lVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.L);
                            break;
                        case Consts.SP /* 32 */:
                            lVar.f35968t = l(typedArrayObtainStyledAttributes, index, lVar.f35968t);
                            break;
                        case 33:
                            lVar.f35969u = l(typedArrayObtainStyledAttributes, index, lVar.f35969u);
                            break;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            lVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.I);
                            break;
                        case 35:
                            lVar.f35959n = l(typedArrayObtainStyledAttributes, index, lVar.f35959n);
                            break;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            lVar.m = l(typedArrayObtainStyledAttributes, index, lVar.m);
                            break;
                        case 37:
                            lVar.f35973y = typedArrayObtainStyledAttributes.getFloat(index, lVar.f35973y);
                            break;
                        case 38:
                            kVar.f35925a = typedArrayObtainStyledAttributes.getResourceId(index, kVar.f35925a);
                            break;
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            lVar.V = typedArrayObtainStyledAttributes.getFloat(index, lVar.V);
                            break;
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            lVar.U = typedArrayObtainStyledAttributes.getFloat(index, lVar.U);
                            break;
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            lVar.W = typedArrayObtainStyledAttributes.getInt(index, lVar.W);
                            break;
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            lVar.X = typedArrayObtainStyledAttributes.getInt(index, lVar.X);
                            break;
                        case 43:
                            nVar.f35991d = typedArrayObtainStyledAttributes.getFloat(index, nVar.f35991d);
                            break;
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            oVar.m = true;
                            oVar.f36006n = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36006n);
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            oVar.f35996c = typedArrayObtainStyledAttributes.getFloat(index, oVar.f35996c);
                            break;
                        case 46:
                            oVar.f35997d = typedArrayObtainStyledAttributes.getFloat(index, oVar.f35997d);
                            break;
                        case 47:
                            oVar.f35998e = typedArrayObtainStyledAttributes.getFloat(index, oVar.f35998e);
                            break;
                        case 48:
                            oVar.f35999f = typedArrayObtainStyledAttributes.getFloat(index, oVar.f35999f);
                            break;
                        case 49:
                            oVar.f36000g = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36000g);
                            break;
                        case 50:
                            oVar.f36001h = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36001h);
                            break;
                        case 51:
                            oVar.f36003j = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36003j);
                            break;
                        case 52:
                            oVar.f36004k = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36004k);
                            break;
                        case 53:
                            oVar.f36005l = typedArrayObtainStyledAttributes.getDimension(index, oVar.f36005l);
                            break;
                        case 54:
                            lVar.Y = typedArrayObtainStyledAttributes.getInt(index, lVar.Y);
                            break;
                        case 55:
                            lVar.Z = typedArrayObtainStyledAttributes.getInt(index, lVar.Z);
                            break;
                        case 56:
                            lVar.f35935a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f35935a0);
                            break;
                        case 57:
                            lVar.f35937b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f35937b0);
                            break;
                        case 58:
                            lVar.f35939c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f35939c0);
                            break;
                        case 59:
                            lVar.f35941d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f35941d0);
                            break;
                        case 60:
                            oVar.f35995b = typedArrayObtainStyledAttributes.getFloat(index, oVar.f35995b);
                            break;
                        case 61:
                            lVar.A = l(typedArrayObtainStyledAttributes, index, lVar.A);
                            break;
                        case 62:
                            lVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.B);
                            break;
                        case 63:
                            lVar.C = typedArrayObtainStyledAttributes.getFloat(index, lVar.C);
                            break;
                        case 64:
                            mVar.f35977b = l(typedArrayObtainStyledAttributes, index, mVar.f35977b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                mVar.f35979d = c4.e.f6546d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                mVar.f35979d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            mVar.f35981f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            mVar.f35983h = typedArrayObtainStyledAttributes.getFloat(index, mVar.f35983h);
                            break;
                        case 68:
                            nVar.f35992e = typedArrayObtainStyledAttributes.getFloat(index, nVar.f35992e);
                            break;
                        case UCrop.REQUEST_CROP /* 69 */:
                            lVar.f35943e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            lVar.f35945f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            lVar.f35947g0 = typedArrayObtainStyledAttributes.getInt(index, lVar.f35947g0);
                            break;
                        case 73:
                            lVar.f35949h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f35949h0);
                            break;
                        case 74:
                            lVar.f35955k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                            lVar.f35962o0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.f35962o0);
                            break;
                        case 76:
                            mVar.f35980e = typedArrayObtainStyledAttributes.getInt(index, mVar.f35980e);
                            break;
                        case 77:
                            lVar.f35957l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            nVar.f35990c = typedArrayObtainStyledAttributes.getInt(index, nVar.f35990c);
                            break;
                        case 79:
                            mVar.f35982g = typedArrayObtainStyledAttributes.getFloat(index, mVar.f35982g);
                            break;
                        case 80:
                            lVar.f35958m0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.f35958m0);
                            break;
                        case 81:
                            lVar.f35960n0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.f35960n0);
                            break;
                        case 82:
                            mVar.f35978c = typedArrayObtainStyledAttributes.getInteger(index, mVar.f35978c);
                            break;
                        case 83:
                            oVar.f36002i = l(typedArrayObtainStyledAttributes, index, oVar.f36002i);
                            break;
                        case 84:
                            mVar.f35985j = typedArrayObtainStyledAttributes.getInteger(index, mVar.f35985j);
                            break;
                        case 85:
                            mVar.f35984i = typedArrayObtainStyledAttributes.getFloat(index, mVar.f35984i);
                            break;
                        case 86:
                            int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i13 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                mVar.m = resourceId;
                                if (resourceId != -1) {
                                    mVar.f35987l = -2;
                                }
                            } else if (i13 != 3) {
                                mVar.f35987l = typedArrayObtainStyledAttributes.getInteger(index, mVar.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                mVar.f35986k = string;
                                if (string.indexOf("/") <= 0) {
                                    mVar.f35987l = -1;
                                } else {
                                    mVar.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    mVar.f35987l = -2;
                                }
                            }
                            break;
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            lVar.f35966r = l(typedArrayObtainStyledAttributes, index, lVar.f35966r);
                            break;
                        case 92:
                            lVar.f35967s = l(typedArrayObtainStyledAttributes, index, lVar.f35967s);
                            break;
                        case 93:
                            lVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.M);
                            break;
                        case 94:
                            lVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.T);
                            break;
                        case 95:
                            m(lVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case UCrop.RESULT_ERROR /* 96 */:
                            m(lVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            lVar.f35964p0 = typedArrayObtainStyledAttributes.getInt(index, lVar.f35964p0);
                            break;
                    }
                    i11++;
                } else if (lVar.f35955k0 != null) {
                    lVar.f35953j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    public static int l(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void m(Object obj, TypedArray typedArray, int i11, int i12) {
        int dimensionPixelSize;
        j jVar;
        l lVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i11).type;
        boolean z11 = true;
        int i14 = 0;
        if (i13 != 3) {
            if (i13 != 5) {
                dimensionPixelSize = typedArray.getInt(i11, 0);
                if (dimensionPixelSize == -4) {
                    i14 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z11 = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i12 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i14;
                        eVar.W = z11;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i14;
                        eVar.X = z11;
                        return;
                    }
                }
                if (obj instanceof l) {
                    lVar = (l) obj;
                    if (i12 == 0) {
                        lVar.f35938c = i14;
                        lVar.f35958m0 = z11;
                        return;
                    } else {
                        lVar.f35940d = i14;
                        lVar.f35960n0 = z11;
                        return;
                    }
                }
                if (obj instanceof j) {
                    jVar = (j) obj;
                    if (i12 == 0) {
                        jVar.b(23, i14);
                        jVar.d(80, z11);
                        return;
                    } else {
                        jVar.b(21, i14);
                        jVar.d(81, z11);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i11, 0);
            z11 = false;
            i14 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i12 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i14;
                    eVar.W = z11;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i14;
                    eVar.X = z11;
                    return;
                }
            }
            if (obj instanceof l) {
                lVar = (l) obj;
                if (i12 == 0) {
                    lVar.f35938c = i14;
                    lVar.f35958m0 = z11;
                    return;
                } else {
                    lVar.f35940d = i14;
                    lVar.f35960n0 = z11;
                    return;
                }
            }
            if (obj instanceof j) {
                jVar = (j) obj;
                if (i12 == 0) {
                    jVar.b(23, i14);
                    jVar.d(80, z11);
                    return;
                } else {
                    jVar.b(21, i14);
                    jVar.d(81, z11);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i11);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i12 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    n(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof l) {
                    ((l) obj).f35974z = strTrim2;
                    return;
                } else {
                    if (obj instanceof j) {
                        ((j) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f5 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i12 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.H = f5;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.I = f5;
                            return;
                        }
                    }
                    if (obj instanceof l) {
                        l lVar2 = (l) obj;
                        if (i12 == 0) {
                            lVar2.f35938c = 0;
                            lVar2.V = f5;
                            return;
                        } else {
                            lVar2.f35940d = 0;
                            lVar2.U = f5;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar2 = (j) obj;
                        if (i12 == 0) {
                            jVar2.b(23, 0);
                            jVar2.a(39, f5);
                            return;
                        } else {
                            jVar2.b(21, 0);
                            jVar2.a(40, f5);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i12 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.S = fMax;
                            eVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof l) {
                        l lVar3 = (l) obj;
                        if (i12 == 0) {
                            lVar3.f35938c = 0;
                            lVar3.f35943e0 = fMax;
                            lVar3.Y = 2;
                            return;
                        } else {
                            lVar3.f35940d = 0;
                            lVar3.f35945f0 = fMax;
                            lVar3.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar3 = (j) obj;
                        if (i12 == 0) {
                            jVar3.b(23, 0);
                            jVar3.b(54, 2);
                        } else {
                            jVar3.b(21, 0);
                            jVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void n(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i12 = i11;
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f5 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO && f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            if (i12 == 1) {
                                Math.abs(f11 / f5);
                            } else {
                                Math.abs(f5 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void o(k kVar, TypedArray typedArray) {
        char c11;
        int indexCount = typedArray.getIndexCount();
        j jVar = new j();
        jVar.f35913a = new int[10];
        jVar.f35914b = new int[10];
        int i11 = 0;
        jVar.f35915c = 0;
        jVar.f35916d = new int[10];
        jVar.f35917e = new float[10];
        jVar.f35918f = 0;
        jVar.f35919g = new int[5];
        jVar.f35920h = new String[5];
        jVar.f35921i = 0;
        jVar.f35922j = new int[4];
        jVar.f35923k = new boolean[4];
        jVar.f35924l = 0;
        kVar.f35932h = jVar;
        m mVar = kVar.f35928d;
        mVar.f35976a = false;
        l lVar = kVar.f35929e;
        lVar.f35936b = false;
        n nVar = kVar.f35927c;
        nVar.f35988a = false;
        o oVar = kVar.f35930f;
        oVar.f35994a = false;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArray.getIndex(i12);
            int i13 = f36009j.get(index);
            SparseIntArray sparseIntArray = f36008i;
            switch (i13) {
                case 2:
                    c11 = 5;
                    jVar.b(2, typedArray.getDimensionPixelSize(index, lVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case Consts.SP /* 32 */:
                case 33:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    c11 = 5;
                    break;
                case 5:
                    c11 = 5;
                    jVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    jVar.b(6, typedArray.getDimensionPixelOffset(index, lVar.D));
                    c11 = 5;
                    break;
                case 7:
                    jVar.b(7, typedArray.getDimensionPixelOffset(index, lVar.E));
                    c11 = 5;
                    break;
                case 8:
                    jVar.b(8, typedArray.getDimensionPixelSize(index, lVar.K));
                    c11 = 5;
                    break;
                case 11:
                    jVar.b(11, typedArray.getDimensionPixelSize(index, lVar.Q));
                    c11 = 5;
                    break;
                case 12:
                    jVar.b(12, typedArray.getDimensionPixelSize(index, lVar.R));
                    c11 = 5;
                    break;
                case 13:
                    jVar.b(13, typedArray.getDimensionPixelSize(index, lVar.N));
                    c11 = 5;
                    break;
                case 14:
                    jVar.b(14, typedArray.getDimensionPixelSize(index, lVar.P));
                    c11 = 5;
                    break;
                case 15:
                    jVar.b(15, typedArray.getDimensionPixelSize(index, lVar.S));
                    c11 = 5;
                    break;
                case 16:
                    jVar.b(16, typedArray.getDimensionPixelSize(index, lVar.O));
                    c11 = 5;
                    break;
                case 17:
                    jVar.b(17, typedArray.getDimensionPixelOffset(index, lVar.f35942e));
                    c11 = 5;
                    break;
                case 18:
                    jVar.b(18, typedArray.getDimensionPixelOffset(index, lVar.f35944f));
                    c11 = 5;
                    break;
                case 19:
                    jVar.a(19, typedArray.getFloat(index, lVar.f35946g));
                    c11 = 5;
                    break;
                case 20:
                    jVar.a(20, typedArray.getFloat(index, lVar.f35972x));
                    c11 = 5;
                    break;
                case 21:
                    jVar.b(21, typedArray.getLayoutDimension(index, lVar.f35940d));
                    c11 = 5;
                    break;
                case 22:
                    jVar.b(22, f36007h[typedArray.getInt(index, nVar.f35989b)]);
                    c11 = 5;
                    break;
                case 23:
                    jVar.b(23, typedArray.getLayoutDimension(index, lVar.f35938c));
                    c11 = 5;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    jVar.b(24, typedArray.getDimensionPixelSize(index, lVar.G));
                    c11 = 5;
                    break;
                case 27:
                    jVar.b(27, typedArray.getInt(index, lVar.F));
                    c11 = 5;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    jVar.b(28, typedArray.getDimensionPixelSize(index, lVar.H));
                    c11 = 5;
                    break;
                case 31:
                    jVar.b(31, typedArray.getDimensionPixelSize(index, lVar.L));
                    c11 = 5;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    jVar.b(34, typedArray.getDimensionPixelSize(index, lVar.I));
                    c11 = 5;
                    break;
                case 37:
                    jVar.a(37, typedArray.getFloat(index, lVar.f35973y));
                    c11 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, kVar.f35925a);
                    kVar.f35925a = resourceId;
                    jVar.b(38, resourceId);
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    jVar.a(39, typedArray.getFloat(index, lVar.V));
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    jVar.a(40, typedArray.getFloat(index, lVar.U));
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    jVar.b(41, typedArray.getInt(index, lVar.W));
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    jVar.b(42, typedArray.getInt(index, lVar.X));
                    c11 = 5;
                    break;
                case 43:
                    jVar.a(43, typedArray.getFloat(index, nVar.f35991d));
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    jVar.d(44, true);
                    jVar.a(44, typedArray.getDimension(index, oVar.f36006n));
                    c11 = 5;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    jVar.a(45, typedArray.getFloat(index, oVar.f35996c));
                    c11 = 5;
                    break;
                case 46:
                    jVar.a(46, typedArray.getFloat(index, oVar.f35997d));
                    c11 = 5;
                    break;
                case 47:
                    jVar.a(47, typedArray.getFloat(index, oVar.f35998e));
                    c11 = 5;
                    break;
                case 48:
                    jVar.a(48, typedArray.getFloat(index, oVar.f35999f));
                    c11 = 5;
                    break;
                case 49:
                    jVar.a(49, typedArray.getDimension(index, oVar.f36000g));
                    c11 = 5;
                    break;
                case 50:
                    jVar.a(50, typedArray.getDimension(index, oVar.f36001h));
                    c11 = 5;
                    break;
                case 51:
                    jVar.a(51, typedArray.getDimension(index, oVar.f36003j));
                    c11 = 5;
                    break;
                case 52:
                    jVar.a(52, typedArray.getDimension(index, oVar.f36004k));
                    c11 = 5;
                    break;
                case 53:
                    jVar.a(53, typedArray.getDimension(index, oVar.f36005l));
                    c11 = 5;
                    break;
                case 54:
                    jVar.b(54, typedArray.getInt(index, lVar.Y));
                    c11 = 5;
                    break;
                case 55:
                    jVar.b(55, typedArray.getInt(index, lVar.Z));
                    c11 = 5;
                    break;
                case 56:
                    jVar.b(56, typedArray.getDimensionPixelSize(index, lVar.f35935a0));
                    c11 = 5;
                    break;
                case 57:
                    jVar.b(57, typedArray.getDimensionPixelSize(index, lVar.f35937b0));
                    c11 = 5;
                    break;
                case 58:
                    jVar.b(58, typedArray.getDimensionPixelSize(index, lVar.f35939c0));
                    c11 = 5;
                    break;
                case 59:
                    jVar.b(59, typedArray.getDimensionPixelSize(index, lVar.f35941d0));
                    c11 = 5;
                    break;
                case 60:
                    jVar.a(60, typedArray.getFloat(index, oVar.f35995b));
                    c11 = 5;
                    break;
                case 62:
                    jVar.b(62, typedArray.getDimensionPixelSize(index, lVar.B));
                    c11 = 5;
                    break;
                case 63:
                    jVar.a(63, typedArray.getFloat(index, lVar.C));
                    c11 = 5;
                    break;
                case 64:
                    jVar.b(64, l(typedArray, index, mVar.f35977b));
                    c11 = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        jVar.c(65, typedArray.getString(index));
                    } else {
                        jVar.c(65, c4.e.f6546d[typedArray.getInteger(index, i11)]);
                    }
                    c11 = 5;
                    break;
                case 66:
                    i11 = 0;
                    jVar.b(66, typedArray.getInt(index, 0));
                    c11 = 5;
                    break;
                case 67:
                    jVar.a(67, typedArray.getFloat(index, mVar.f35983h));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 68:
                    jVar.a(68, typedArray.getFloat(index, nVar.f35992e));
                    i11 = 0;
                    c11 = 5;
                    break;
                case UCrop.REQUEST_CROP /* 69 */:
                    jVar.a(69, typedArray.getFloat(index, 1.0f));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 70:
                    jVar.a(70, typedArray.getFloat(index, 1.0f));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 71:
                    c11 = 5;
                    break;
                case 72:
                    jVar.b(72, typedArray.getInt(index, lVar.f35947g0));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 73:
                    jVar.b(73, typedArray.getDimensionPixelSize(index, lVar.f35949h0));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 74:
                    jVar.c(74, typedArray.getString(index));
                    i11 = 0;
                    c11 = 5;
                    break;
                case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                    jVar.d(75, typedArray.getBoolean(index, lVar.f35962o0));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 76:
                    jVar.b(76, typedArray.getInt(index, mVar.f35980e));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 77:
                    jVar.c(77, typedArray.getString(index));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 78:
                    jVar.b(78, typedArray.getInt(index, nVar.f35990c));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 79:
                    jVar.a(79, typedArray.getFloat(index, mVar.f35982g));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 80:
                    jVar.d(80, typedArray.getBoolean(index, lVar.f35958m0));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 81:
                    jVar.d(81, typedArray.getBoolean(index, lVar.f35960n0));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 82:
                    jVar.b(82, typedArray.getInteger(index, mVar.f35978c));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 83:
                    jVar.b(83, l(typedArray, index, oVar.f36002i));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 84:
                    jVar.b(84, typedArray.getInteger(index, mVar.f35985j));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 85:
                    jVar.a(85, typedArray.getFloat(index, mVar.f35984i));
                    i11 = 0;
                    c11 = 5;
                    break;
                case 86:
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        mVar.m = resourceId2;
                        jVar.b(89, resourceId2);
                        if (mVar.m != -1) {
                            mVar.f35987l = -2;
                            jVar.b(88, -2);
                        }
                    } else if (i14 == 3) {
                        String string = typedArray.getString(index);
                        mVar.f35986k = string;
                        jVar.c(90, string);
                        if (mVar.f35986k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            mVar.m = resourceId3;
                            jVar.b(89, resourceId3);
                            mVar.f35987l = -2;
                            jVar.b(88, -2);
                        } else {
                            mVar.f35987l = -1;
                            jVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, mVar.m);
                        mVar.f35987l = integer;
                        jVar.b(88, integer);
                    }
                    i11 = 0;
                    c11 = 5;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    c11 = 5;
                    break;
                case 93:
                    jVar.b(93, typedArray.getDimensionPixelSize(index, lVar.M));
                    c11 = 5;
                    break;
                case 94:
                    jVar.b(94, typedArray.getDimensionPixelSize(index, lVar.T));
                    c11 = 5;
                    break;
                case 95:
                    m(jVar, typedArray, index, i11);
                    c11 = 5;
                    break;
                case UCrop.RESULT_ERROR /* 96 */:
                    m(jVar, typedArray, index, 1);
                    c11 = 5;
                    break;
                case 97:
                    jVar.b(97, typedArray.getInt(index, lVar.f35964p0));
                    c11 = 5;
                    break;
                case 98:
                    if (MotionLayout.f1268h1) {
                        int resourceId4 = typedArray.getResourceId(index, kVar.f35925a);
                        kVar.f35925a = resourceId4;
                        if (resourceId4 == -1) {
                            kVar.f35926b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        kVar.f35926b = typedArray.getString(index);
                    } else {
                        kVar.f35925a = typedArray.getResourceId(index, kVar.f35925a);
                    }
                    c11 = 5;
                    break;
                case 99:
                    jVar.d(99, typedArray.getBoolean(index, lVar.f35948h));
                    c11 = 5;
                    break;
            }
        }
    }

    public final void a(MotionLayout motionLayout) {
        k kVar;
        int childCount = motionLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            int id2 = childAt.getId();
            Integer numValueOf = Integer.valueOf(id2);
            HashMap map = this.f36016g;
            if (!map.containsKey(numValueOf)) {
                g0.t(childAt);
            } else {
                if (this.f36015f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id2)) && (kVar = (k) map.get(Integer.valueOf(id2))) != null) {
                    b.e(childAt, kVar.f35931g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f36016g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                g0.t(childAt);
            } else {
                if (this.f36015f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && map.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    k kVar = (k) map.get(Integer.valueOf(id2));
                    if (kVar != null) {
                        n nVar = kVar.f35927c;
                        l lVar = kVar.f35929e;
                        o oVar = kVar.f35930f;
                        if (childAt instanceof Barrier) {
                            lVar.f35951i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(lVar.f35947g0);
                            barrier.setMargin(lVar.f35949h0);
                            barrier.setAllowsGoneWidget(lVar.f35962o0);
                            int[] iArr = lVar.f35953j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = lVar.f35955k0;
                                if (str != null) {
                                    int[] iArrF = f(barrier, str);
                                    lVar.f35953j0 = iArrF;
                                    barrier.setReferencedIds(iArrF);
                                }
                            }
                        }
                        e eVar = (e) childAt.getLayoutParams();
                        eVar.a();
                        kVar.a(eVar);
                        b.e(childAt, kVar.f35931g);
                        childAt.setLayoutParams(eVar);
                        if (nVar.f35990c == 0) {
                            childAt.setVisibility(nVar.f35989b);
                        }
                        childAt.setAlpha(nVar.f35991d);
                        childAt.setRotation(oVar.f35995b);
                        childAt.setRotationX(oVar.f35996c);
                        childAt.setRotationY(oVar.f35997d);
                        childAt.setScaleX(oVar.f35998e);
                        childAt.setScaleY(oVar.f35999f);
                        if (oVar.f36002i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(oVar.f36002i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(oVar.f36000g)) {
                                childAt.setPivotX(oVar.f36000g);
                            }
                            if (!Float.isNaN(oVar.f36001h)) {
                                childAt.setPivotY(oVar.f36001h);
                            }
                        }
                        childAt.setTranslationX(oVar.f36003j);
                        childAt.setTranslationY(oVar.f36004k);
                        childAt.setTranslationZ(oVar.f36005l);
                        if (oVar.m) {
                            childAt.setElevation(oVar.f36006n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            k kVar2 = (k) map.get(num);
            if (kVar2 != null) {
                l lVar2 = kVar2.f35929e;
                if (lVar2.f35951i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = lVar2.f35953j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = lVar2.f35955k0;
                        if (str2 != null) {
                            int[] iArrF2 = f(barrier2, str2);
                            lVar2.f35953j0 = iArrF2;
                            barrier2.setReferencedIds(iArrF2);
                        }
                    }
                    barrier2.setType(lVar2.f35947g0);
                    barrier2.setMargin(lVar2.f35949h0);
                    v vVar = ConstraintLayout.R;
                    e eVar2 = new e(-2, -2);
                    barrier2.q();
                    kVar2.a(eVar2);
                    constraintLayout.addView(barrier2, eVar2);
                }
                if (lVar2.f35934a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    v vVar2 = ConstraintLayout.R;
                    e eVar3 = new e(-2, -2);
                    kVar2.a(eVar3);
                    constraintLayout.addView(guideline, eVar3);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).g(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i11;
        HashMap map;
        int i12;
        int i13;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = pVar.f36016g;
        map2.clear();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = constraintLayout.getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (pVar.f36015f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id2))) {
                map2.put(Integer.valueOf(id2), new k());
            }
            k kVar = (k) map2.get(Integer.valueOf(id2));
            if (kVar == null) {
                i11 = childCount;
                map = map2;
                i12 = i14;
            } else {
                n nVar = kVar.f35927c;
                l lVar = kVar.f35929e;
                o oVar = kVar.f35930f;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map4 = pVar.f36014e;
                for (String str : map4.keySet()) {
                    int i15 = childCount;
                    b bVar = (b) map4.get(str);
                    HashMap map5 = map2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i13 = i14;
                            try {
                                map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i13 = i14;
                            map3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i13 = i14;
                    }
                    map2 = map5;
                    childCount = i15;
                    i14 = i13;
                }
                i11 = childCount;
                map = map2;
                i12 = i14;
                kVar.f35931g = map3;
                kVar.c(id2, eVar);
                nVar.f35989b = childAt.getVisibility();
                nVar.f35991d = childAt.getAlpha();
                oVar.f35995b = childAt.getRotation();
                oVar.f35996c = childAt.getRotationX();
                oVar.f35997d = childAt.getRotationY();
                oVar.f35998e = childAt.getScaleX();
                oVar.f35999f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oVar.f36000g = pivotX;
                    oVar.f36001h = pivotY;
                }
                oVar.f36003j = childAt.getTranslationX();
                oVar.f36004k = childAt.getTranslationY();
                oVar.f36005l = childAt.getTranslationZ();
                if (oVar.m) {
                    oVar.f36006n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    lVar.f35962o0 = barrier.getAllowsGoneWidget();
                    lVar.f35953j0 = barrier.getReferencedIds();
                    lVar.f35947g0 = barrier.getType();
                    lVar.f35949h0 = barrier.getMargin();
                }
            }
            i14 = i12 + 1;
            pVar = this;
            map2 = map;
            childCount = i11;
        }
    }

    public final k h(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f36016g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i11), new k());
        }
        return (k) map.get(Integer.valueOf(i11));
    }

    public final k i(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f36016g;
        if (map.containsKey(numValueOf)) {
            return (k) map.get(Integer.valueOf(i11));
        }
        return null;
    }

    public final void j(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    k kVarG = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        kVarG.f35929e.f35934a = true;
                    }
                    this.f36016g.put(Integer.valueOf(kVarG.f35925a), kVarG);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            k kVarG = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (kVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                kVarG.f35929e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (kVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                kVarG.f35928d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                kVarG = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (kVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                kVarG.f35927c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (kVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                kVarG.f35930f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                kVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                l lVar = kVarG.f35929e;
                                lVar.f35934a = true;
                                lVar.f35936b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                kVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                kVarG.f35929e.f35951i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                kVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (kVarG == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    b.d(context, xmlResourceParser, kVarG.f35931g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f36016g.put(Integer.valueOf(kVarG.f35925a), kVarG);
                    kVarG = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
