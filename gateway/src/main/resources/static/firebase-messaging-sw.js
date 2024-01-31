importScripts('https://www.gstatic.com/firebasejs/9.6.0/firebase-app-compat.js');
importScripts('https://www.gstatic.com/firebasejs/9.6.0/firebase-messaging-compat.js');

firebase.initializeApp({
    apiKey: "AIzaSyDWueF6tamLMPsCa5klVcskfYnqTdb0yHo",
    authDomain: "smac-notification.firebaseapp.com",
    projectId: "smac-notification",
    storageBucket: "smac-notification.appspot.com",
    messagingSenderId: "82488866007",
    appId: "1:82488866007:web:43f0d76c533f4e354d2c92",
    measurementId: "G-45KKJBXZEC"
});
const messaging = firebase.messaging();
let url = "Hùng test";
messaging.onBackgroundMessage((payload) => {
    const notificationTitle = payload.notification.title;
    const notificationOptions = {
        title: payload.notification.title,
        body: payload.notification.body,
        icon: payload.notification.image
    };
    url = payload.data.reportLink;
    self.registration.showNotification(notificationTitle, notificationOptions);
});

// Xử lý các sự kiện khi người dùng nhấp vào thông báo
self.addEventListener('notificationclick', event => {
    // Đóng thông báo
    event.notification.close();

    // Chuyển hướng người dùng đến trang web
    event.waitUntil(
        clients.matchAll({ type: 'window' }).then(windowClients => {
            for (let i = 0; i < windowClients.length; i++) {
                const client = windowClients[i];
                if (client.url === url && 'focus' in client) {
                    return client.focus();
                }
            }
            if (clients.openWindow) {
                return clients.openWindow(url);
            }
        })
    );
});