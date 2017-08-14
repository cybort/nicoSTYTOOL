package nico;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsVideo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.CountListener;
import cn.bmob.v3.listener.EmailVerifyListener;
import cn.bmob.v3.listener.GetListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import dump.b.Main3Activity;
import dump.c.FlymeUtils;
import dump.j.o;
import dump.k.i_a;
import dump.t.FK__;
import nico.styTool.Constant;
import nico.styTool.MyUser;
import nico.styTool.ProviderUi;
import nico.styTool.R;
import nico.styTool.RobotChatActivity;
import nico.styTool.Update;
import nico.styTool.UserProfileActivity;
import nico.styTool.Viewhtml;
import nico.styTool.app_th;
import nico.styTool.iApp;
import nico.styTool.lua;
import nico.styTool.wlflActivity;
import nico.styTool.z;


public class SimpleActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    int count = 0;
    private DrawerLayout mDrawerLayout;
    private static ProgressBar progBar;

    private Button ediComment;// 广播
    private TextView userName;


    private void qqdex() {

        ajoinQQGroupdata("ySV0pEgXykC5oCBFxnBC0wuEKP4FvRkJ");
    }

    public boolean ajoinQQGroupdata(String key) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + key));
// 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        try {
            startActivity(intent);
            return true;
        } catch (Exception e) {
// 未安装手Q或安装的版本不支持
            return false;
        }
    }

    private void qqb() {

        ajoinQQGroup("o0KRNRCzvzr76etbbj2cijqKtIq_f6dK");
    }

    public boolean ajoinQQGroup(String key) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + key));
// 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        try {
            startActivity(intent);
            return true;
        } catch (Exception e) {
// 未安装手Q或安装的版本不支持
            return false;
        }
    }

    private void qqa() {

        joinQQGroup("ROrrIRie5VeJL2WiJZmvCODc68JGEWyw");
    }

    public boolean joinQQGroup(String key) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + key));
// 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        try {
            startActivity(intent);
            return true;
        } catch (Exception e) {
// 未安装手Q或安装的版本不支持
            return false;
        }
    }

        /*final SharedPreferences setting = SimpleActivity.this.getSharedPreferences("Viewpa__m", 0);
        Boolean user_first = setting.getBoolean("FIRST", true);
        if (user_first) {

            LayoutInflater inflater = LayoutInflater.from(this);
            View view = inflater.inflate(R.layout.a_boo, null);
            ediComment = (Button) view.findViewById(R.id.button4);
            progBar = (ProgressBar) view.findViewById(R.id.progressBar1);

            ediComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDownloadService();
                }
            });

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("厚脸无耻求支援")
                    .setView(view)
                    .setPositiveButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("领取现金红包", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    final String[] os = {"妮媌帐号已经激活过", "下载查券宝并且安装使用", "QQ号最后两位（0.**）＋妮媌注册日期（0.日）－领取当天（0.日）＝领取余额】", "活动时间 2017.7.14-2017.8.16", "说明：领取前提需要（个人资料截图和查券宝截图）", "添加我:2652649464"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
                    AlertDialog alert = builder.setTitle("免费领取现金红包条件")
                            .setPositiveButton("推荐朋友免费领取", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent sendIntent = new Intent();
                                    sendIntent.setAction(Intent.ACTION_SEND);
                                    sendIntent.putExtra(Intent.EXTRA_TEXT, "嗨 妮媌多顶集合功能，快速上手\n简：一目了然\n美：十全十美\n http://www.coolapk.com/apk/nico.styTool");
                                    sendIntent.setType("text/plain");
                                    startActivity(sendIntent);
                                }
                            }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setItems(os, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setCancelable(false).create();
                    alert.show();

                }
            }).setCancelable(false)
                    .create().show();
        } else {

        }*/

    public void makeRootDirectory(String filePath) {
        File file = null;
        try {
            file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            Toast.makeText(this, "初始化失败！部分功能可能无法使用", Toast.LENGTH_SHORT).show();

        }
    }

    private void xft() {

        BmobQuery<i_a> query = new BmobQuery<i_a>();
        query.getObject(SimpleActivity.this, "03bf357e85", new GetListener<i_a>() {

            @Override
            public void onSuccess(i_a object) {
                String s = object.getContent();
                String sr = Constant.a_mi + "\n" + Constant.a_miui;
                if (s.equals(sr)) {

                } else {
                    LayoutInflater inflater = LayoutInflater.from(SimpleActivity.this);
                    View view = inflater.inflate(R.layout.cpl_main, null);
                    final TextView a = (TextView) view.findViewById(R.id.cplmainTextView1);
                    a.setText(object.getContent());
                    AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
                    builder.setView(view)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    BmobQuery<o> query = new BmobQuery<o>();
                                    query.getObject(SimpleActivity.this, "8304c235d2", new GetListener<o>() {

                                        @Override
                                        public void onSuccess(o object) {
                                            String s = "520";
                                            String sr = object.getContent();
                                            if (s.equals(sr)) {
                                                Uri uri = Uri.parse("http://www.coolapk.com/apk/nico.styTool");
                                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                startActivity(intent);
                                            } else {
                                                Uri uri = Uri.parse(object.getContent());
                                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                startActivity(intent);
                                            }

                                        }

                                        @Override
                                        public void onFailure(int code, String msg) {
                                            Uri uri = Uri.parse("http://www.coolapk.com/apk/nico.styTool");
                                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                            startActivity(intent);
                                        }
                                    });


                                }
                            }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {


                        }
                    }).setCancelable(false).create().show();

                }
            }


            @Override
            public void onFailure(int code, String msg) {

            }
        });

    }

    public void Bin2(View view) {
        mh();
    }

    @Override
    protected void onResume() {
        super.onResume();
        xft();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        navigationView.setNavigationItemSelectedListener(this);

        View headerView = navigationView.getHeaderView(0);


        MyUser myUserw = BmobUser.getCurrentUser(SimpleActivity.this, MyUser.class);
        if (myUserw != null) {
            TextView userName = (TextView) headerView.findViewById(R.id.appbarmainTextView3);
            userName.setText(myUserw.getUsername() + "");
            userName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyUser myUserw = BmobUser.getCurrentUser(SimpleActivity.this, MyUser.class);
                    if (myUserw != null) {
                        Intent intent = new Intent(SimpleActivity.this, UserProfileActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(SimpleActivity.this, app_th.class);
                        startActivity(intent);
                    }
                }
            });
        } else {

        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager);
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyUser myUserw = BmobUser.getCurrentUser(SimpleActivity.this, MyUser.class);
                if (myUserw != null) {
                    Intent intent = new Intent(SimpleActivity.this, Update.class);
                    startActivity(intent);
                } else {
                    Intent inte = new Intent(SimpleActivity.this, app_th.class);
                    startActivity(inte);
                    Toast.makeText(SimpleActivity.this, "需要登录帐号同步到云端", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final SharedPreferences i0 = getSharedPreferences("Hellostytool", 0);
        Boolean o00 = i0.getBoolean("FIRST", true);
        if (o00) {
            AppCompatDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("妮喵AI智障")
                    .setMessage("魅族手机，flyme系统要关掉游戏模式或者打开悬浮球，才能使用返回键和调出多任务")
                    .setNeutralButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            i0.edit().putBoolean("FIRST", false).apply();
                        }
                    }).create();
            alertDialog.show();
        } else {
            Toast.makeText(this, "快交出来，你手机中的小电影", Toast.LENGTH_SHORT).show();
        }

        final SharedPreferences i = getSharedPreferences("Hello347", 0);
        Boolean o0 = i.getBoolean("FIRST", true);
        if (o0) {
            AppCompatDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle(Constant.a_mi)
                    .setMessage(Constant.a_miui)
                    .setNeutralButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            i.edit().putBoolean("FIRST", false).apply();
                            makeRootDirectory(Environment.getExternalStorageDirectory().getPath() + "/Android/styTool");
                        }
                    }).setCancelable(false).create();
            alertDialog.show();

        } else {
            boolean sFirstRun = (boolean) nico.SPUtils.get(this, "if_styTool", false);
            if (sFirstRun) {
                MediaPlayer mPlayer = MediaPlayer.create(SimpleActivity.this, R.raw.bio);
                mPlayer.start();
            } else {
            }
        }
    }

    private void preinitX5WebCore() {
        if (!QbSdk.isTbsCoreInited()) {
            QbSdk.preInit(getApplicationContext(), null);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish(); // back button
            return true;
        }
        if (id == R.id.action_tool) {
            Intent intent1 = new Intent(SimpleActivity.this, wlflActivity.class);
            startActivity(intent1);
            return true;
        }

        if (id == R.id.action_tb) {
            Intent intent = new Intent(SimpleActivity.this, dump.d.MainActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_edit) {
            Intent intent2 = new Intent(SimpleActivity.this, nico.styTool.gifa.class);
            startActivity(intent2);

            return true;
        }
        if (id == R.id.action_share) {
            LayoutInflater inflater = LayoutInflater.from(this);
            View view = inflater.inflate(R.layout.dex_y, null);
            final TextView ediComment1 = (TextView) view.findViewById(R.id.dexyTextView1);

            StringBuilder phoneInfo = new StringBuilder();
            phoneInfo.append("Product: ").append(android.os.Build.PRODUCT).append(System.getProperty("line.separator"));
            phoneInfo.append("CPU_ABI: ").append(android.os.Build.CPU_ABI).append(System.getProperty("line.separator"));
            phoneInfo.append("TAGS: ").append(android.os.Build.TAGS).append(System.getProperty("line.separator"));
            phoneInfo.append("VERSION_CODES.BASE: " + android.os.Build.VERSION_CODES.BASE).append(System.getProperty("line.separator"));
            phoneInfo.append("MODEL: ").append(android.os.Build.MODEL).append(System.getProperty("line.separator"));
            phoneInfo.append("SDK: ").append(android.os.Build.VERSION.SDK).append(System.getProperty("line.separator"));
            phoneInfo.append("VERSION.RELEASE: ").append(android.os.Build.VERSION.RELEASE).append(System.getProperty("line.separator"));
            phoneInfo.append("DEVICE: ").append(android.os.Build.DEVICE).append(System.getProperty("line.separator"));
            phoneInfo.append("DISPLAY: ").append(android.os.Build.DISPLAY).append(System.getProperty("line.separator"));
            phoneInfo.append("BRAND: ").append(android.os.Build.BRAND).append(System.getProperty("line.separator"));
            phoneInfo.append("BOARD: ").append(android.os.Build.BOARD).append(System.getProperty("line.separator"));
            phoneInfo.append("FINGERPRINT: ").append(android.os.Build.FINGERPRINT).append(System.getProperty("line.separator"));
            phoneInfo.append("ID: ").append(android.os.Build.ID).append(System.getProperty("line.separator"));
            phoneInfo.append("MANUFACTURER: ").append(android.os.Build.MANUFACTURER).append(System.getProperty("line.separator"));
            phoneInfo.append("USER: ").append(android.os.Build.USER).append(System.getProperty("line.separator"));
            TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            phoneInfo.append("DeviceId(IMEI) = ").append(tm.getDeviceId()).append(System.getProperty("line.separator"));
            phoneInfo.append("DeviceSoftwareVersion = ").append(tm.getDeviceSoftwareVersion()).append(System.getProperty("line.separator"));
            phoneInfo.append("NetworkCountryIso = ").append(tm.getNetworkCountryIso()).append(System.getProperty("line.separator"));
            phoneInfo.append("NetworkOperator = ").append(tm.getNetworkOperator()).append(System.getProperty("line.separator"));
            phoneInfo.append("NetworkOperatorName = ").append(tm.getNetworkOperatorName()).append(System.getProperty("line.separator"));
            phoneInfo.append("NetworkType = ").append(tm.getNetworkType()).append(System.getProperty("line.separator"));
            phoneInfo.append("PhoneType = ").append(tm.getPhoneType()).append(System.getProperty("line.separator"));
            phoneInfo.append("SimOperatorName = ").append(tm.getSimOperatorName()).append(System.getProperty("line.separator"));
            phoneInfo.append("SimState = ").append(tm.getSimState()).append(System.getProperty("line.separator"));
            ediComment1.setText("" + phoneInfo);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(view)
                    .setPositiveButton("QQ信息连发器", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
//开始
                            MyUser myUserw = BmobUser.getCurrentUser(SimpleActivity.this, MyUser.class);
                            if (myUserw != null) {
                                final MyUser myUser = BmobUser.getCurrentUser(SimpleActivity.this, MyUser.class);
                                BmobQuery<MyUser> query = new BmobQuery<MyUser>();
                                query.getObject(SimpleActivity.this, myUser.getObjectId(), new GetListener<MyUser>() {


                                    @Override
                                    public void onSuccess(MyUser object) {
                                        String s = "" + object.getEmailVerified();
                                        String sr = "true";
                                        if (s.equals(sr)) {
                                            Intent intent = new Intent(SimpleActivity.this, lua.class);
                                            startActivity(intent);
                                            //这
                                        } else {
                                            AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
                                            AlertDialog alertDialog = builder.setMessage("你帐号可能还没激活！\n你可以通过以下三条流程激活\n1.加入官方群免费激活\n2.自己进入邮箱激活\n3.个人资料【自助激活】")
                                                    .setNeutralButton("发送激活信息", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            final String email = myUser.getEmail();
                                                            BmobUser.requestEmailVerify(SimpleActivity.this, email, new EmailVerifyListener() {

                                                                @Override
                                                                public void onSuccess() {
                                                                    Toast.makeText(SimpleActivity.this, "请求验证邮件成功，请到" + email + "邮箱中激活账户", Toast.LENGTH_SHORT).show();

                                                                }

                                                                @Override
                                                                public void onFailure(int code, String e) {
                                                                }
                                                            });
                                                        }
                                                    }).create();
                                            alertDialog.show();
                                        }
                                    }

                                    @Override
                                    public void onFailure(int code, String msg) {
                                        Toast.makeText(SimpleActivity.this, "貌似没有网络", Toast.LENGTH_SHORT).show();

                                    }
                                });
                            } else {
                                Intent intent = new Intent(SimpleActivity.this, app_th.class);
                                startActivity(intent);
                            }
                        }
                    }).setNeutralButton("远程管理ftp", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    LayoutInflater inflater = LayoutInflater.from(SimpleActivity.this);
                    View vie = inflater.inflate(R.layout.a_ftp, null);
                    AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
                    builder.setView(vie).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).create().show();
                }
            }).create().show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.b520) {
            BmobQuery<i_a> bmobQuery = new BmobQuery<i_a>();
            bmobQuery.count(this, i_a.class, new CountListener() {

                @Override
                public void onSuccess(int count) {
                    Intent b = new Intent(SimpleActivity.this, nico.styTool.smali_layout_apktool.class);
                    startActivity(b);
                }

                @Override
                public void onFailure(int code, String msg) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
                    AlertDialog alertDialog = builder.setMessage("需要网络初始化插件\n日志:" + code)
                            .setPositiveButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).create();
                    alertDialog.show();
                }
            });
        } else if (id == R.id.Bin3) {
            Intent intent = new Intent(SimpleActivity.this, Viewhtml.class);
            startActivity(intent);
        } else if (id == R.id.Bin4) {
            Intent intent1 = new Intent(SimpleActivity.this, RobotChatActivity.class);
            startActivity(intent1);
        } else if (id == R.id.Bin5) {
            Intent intent2 = new Intent(SimpleActivity.this, z.class);
            startActivity(intent2);
        } else if (id == R.id.A2) {
            Intent intent3 = new Intent(SimpleActivity.this, ProviderUi.class);
            startActivity(intent3);
        } else if (id == R.id.A3) {
            Intent ntent = new Intent(SimpleActivity.this, iApp.class);
            startActivity(ntent);
        } else if (id == R.id.bxp) {
            final ProgressDialog mProgressDialog = ProgressDialog.show(SimpleActivity.this, null, "初始化内核...");
            QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {

                @Override
                public void onViewInitFinished(boolean b) {
                    //x5內核初始化完成的回调，为true表示x5内核加载成功，否则表示x5内核加载失败，会自动切换到系统内核。
                    // Log.d("app", " onViewInitFinished is " + b);
                    if (b) {
                        Intent in = new Intent(SimpleActivity.this, dump.y.x5_MainActivity.class);
                        in.putExtra("#", "http://m.iqiyi.com/");
                        startActivity(in);
                        mProgressDialog.dismiss();
                    } else {
                        Toast.makeText(SimpleActivity.this, "初始化内核失败", Toast.LENGTH_SHORT).show();
                        mProgressDialog.dismiss();
                    }

                }

                @Override
                public void onCoreInitFinished() {

                }
            };
            QbSdk.initX5Environment(getApplicationContext(), cb);

        } else if (id == R.id.A4) {

            final ProgressDialog mProgressDialog = ProgressDialog.show(SimpleActivity.this, null, "初始化内核...");

            @Override
            public void onViewInitFinished ( boolean b){
                //x5內核初始化完成的回调，为true表示x5内核加载成功，否则表示x5内核加载失败，会自动切换到系统内核。
                // Log.d("app", " onViewInitFinished is " + b);
                if (b) {
                    Intent inten = new Intent(SimpleActivity.this, dump.y.x5_MainActivity.class);
                    inten.putExtra("#", "http://shitu.baidu.com/");
                    startActivity(inten);
                    mProgressDialog.dismiss();
                } else {
                    Toast.makeText(SimpleActivity.this, "初始化内核失败", Toast.LENGTH_SHORT).show();
                    mProgressDialog.dismiss();
                }

            }

            @Override
            public void onCoreInitFinished () {

            }
        } ;
        QbSdk.initX5Environment(getApplicationContext(), cb);
    } else if(id ==R.id.q1)

    {
        Intent intent5 = new Intent(SimpleActivity.this, nico.styTool.FJActivity.class);
        SimpleActivity.this.startActivity(intent5);
    } else if(id ==R.id.q2)

    {
        Intent inten = new Intent(SimpleActivity.this, nico.styTool.GankIoActivity.class);
        startActivity(inten);
    } else if(id ==R.id.Bin30)

    {
        Intent aas = new Intent(SimpleActivity.this, Main3Activity.class);
        startActivity(aas);
    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
}

    private void mh() {
        AlertDialog.Builder builder = new AlertDialog.Builder(SimpleActivity.this);
        AlertDialog alertDialog = builder.setMessage("请选择你要加的群")

                .setNeutralButton("4群", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        qqdex();

                    }
                })
                .setNegativeButton("2群（满）", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        qqb();
                    }
                }).setPositiveButton("1群（满）", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        qqa();
                    }
                }).create();
        alertDialog.show();
    }

    private void setupViewPager(ViewPager viewPager) {
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new Sample(), "简");
        adapter.addFragment(new nico.styTool.smali_layout_shell_Util(), "单");
        // adapter.addFragment(new SampleApplication(), "Category 3");
        viewPager.setAdapter(adapter);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }

private static class Adapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragments = new ArrayList<>();
    private final List<String> mFragmentTitles = new ArrayList<>();

    Adapter(FragmentManager fm) {
        super(fm);
    }

    void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }
}
}