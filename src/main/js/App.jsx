function LandingPage() {
    const getSpotifyUserLogin = () => {
        fetch("http://[::1]:8000/api/login")
            .then((response) => response.text())
            .then(response => window.location.replace(response))
    }
}